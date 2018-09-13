
var pageSize = 10;
var pageIndex = 1;

var doFlag = "";


$(document).ready(function() {
    $('#win').window("close");
    doSearch();
});

function doSearch() {

    var param = {
        "pageNum": pageIndex,
        "pageSize": pageSize,
        "isLastPage": "false",
        "orderField": "id asc"
    };

    if($("#search_id").val()!=null&&$("#search_id").val()!=""){
        param.id = $("#search_id").val();
    }
    if($("#search_name").val()!=null&&$("#search_name").val()!=""){
        param.name = $("#search_name").val();
    }

    $.ajax({
        type: "get",
        url: ctx+"user/list",
        data:param,
        success: function (resp) {
            console.log(resp);
                $("#dg").datagrid("loadData",{"total" : resp.count,"rows" : resp.list});
                var pager =$("#dg").datagrid('getPager');
                pager.pagination({
                    total:resp.count,
                    pageSize: resp.pageSize,
                    pageNumber: resp.pageIndex
                });
        }
    });
}

function initPager(){
    $('#dg').datagrid('getPager').pagination({
        pageSize: 10,
        pageList: [10,  20, 50],
        beforePageText: '第',
        afterPageText: '页    共 {pages} 页',
        displayMsg: '当前显示 {from} - {to} 条记录   共 {total} 条记录',
        onSelectPage: function(p_pageNumber, p_pageSize) {
            pageSize = p_pageSize;//行数
            pageIndex = p_pageNumber;//页数
            doSearch();//每次更换页面时触发更改
        }
    });
}

function doClean() {
    $('#search_id').textbox('setValue','');
    $('#search_name').textbox('setValue','');
}



function doInsert(){
    doFlag = "insert";
    $('#window').window('open').window('setTitle','用户新增');
    $('#windowform').form('clear');
}

function doUpdate(){
    doFlag = "update";
    var row = $('#dg').datagrid('getSelected');
    if(row){
        $('#window').window('open').window('setTitle','用户修改');
        $('#windowform').form('clear');
        $('#windowform').form('load',row);
    }else{
        $.messager.alert("提示","请选择一条数据！");
    }
}

function doDelete(){
    doFlag = "delete";
    var row = $('#dg').datagrid('getSelected');
    if(row){

        jQuery.messager.confirm('提示:','您确认要删除吗?',function(event){
            if(event){
                submit();
            }else{
                closeWindow();
            }
        });

    }else{
        $.messager.alert("提示","请选择一条数据！");
    }
}



function submit(){
    if(doFlag!="delete"){
        if(!$("#windowform").form('validate')){
            $.messager.alert("提示","请填完必填项！");
            return;
        }
    }
    if(doFlag=="insert"){
        submitInsert();
    }else if(doFlag=="update"){
        submitUpdate();
    }else{
        submitDelete();
    }
}

function submitInsert(){
    var param = getWindowData();
    console.log(param);
    $.ajax({
        type: "POST",
        url: ctx+"user/insert",
        data:param,
        success: function (resp) {
            console.log(resp);
                closeWindow();
                $.messager.alert("提示","新增成功");
                doSearch();
        }
    });
}


function submitUpdate(){
    var param = getWindowData();
    console.log(param);
    $.ajax({
        type: "POST",
        url: ctx+"user/update",
        data:param,
        success: function (resp) {
            console.log(resp);
            closeWindow();
            $.messager.alert("提示", "修改成功");
            doSearch();
        }
    });
}

function submitDelete(){
    var param = $('#dg').datagrid('getSelected');
    $.ajax({
        type: "POST",
        url: ctx+"user/delete",
        data:param,
        success: function (resp) {
            console.log(resp);
                closeWindow();
                $.messager.alert("提示","删除成功");
                doSearch();
        }
    });
}

// 获取表单数据
function getWindowData(){
    var param = {};

    if($('#id').val()!=null&&$('#id').val()!=undefined){
        param['id'] =$('#id').val();
    }
    if($('#name').val()!=null&&$('#name').val()!=undefined){
        param['name'] =$('#name').val();
    }
    if($('#realName').val()!=null&&$('#realName').val()!=undefined){
        param['realName'] =$('#realName').val();
    }

    return param;
}

function closeWindow(){
    $("#window").window('close');
}











