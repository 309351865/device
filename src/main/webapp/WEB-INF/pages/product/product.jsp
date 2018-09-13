<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <jsp:include page="../common/head.jsp"></jsp:include>
  <script type="text/javascript"  src="${ctx}static/js/product/product.js"></script>



</head>

<body>
<div id="searchbar" class="easyui-panel" noheader="true" style="width: 100%;">
  <form id="searchform">
    <div class="row">
      <span >id:</span>
      <input id="search_id" class="easyui-textbox" type="text">
    </div>
    <div class="row">
      <span >名称:</span>
      <input id="search_name" class="easyui-textbox" type="text">
    </div>

    <div class="row">
      <a href="javascript:void(0);" class="easyui-linkbutton" iconCls="search" plain="true" onclick="doSearch()">查询</a>
      <a href="javascript:void(0);" class="easyui-linkbutton" plain="true" iconCls="edit-remove" onclick="doClean()">清除</a>
    </div>
  </form>
</div>


<table id="dg" class="easyui-datagrid" title=""  toolbar="#toolbar" fitColumns="true"
       data-options="singleSelect:true,collapsible:true,url:'',method:'post',pagination:true"  >
  <thead>
  <tr>
    <th data-options="field:'id',width:50,align:'center'">id</th>
    <th data-options="field:'name',width:300,align:'center'">名称</th>
    <%--<th data-options="field:'realName',width:300,align:'center'">真实姓名</th>--%>
  </tr>
  </thead>
</table>

<div id="toolbar">

  <a href="javascript:void(0);" class="easyui-linkbutton" iconCls="" plain="true" onclick="doInsert()">新增</a>
  <a href="javascript:void(0);" class="easyui-linkbutton" iconCls="" plain="true" onclick="doUpdate()">修改</a>
  <a href="javascript:void(0);" class="easyui-linkbutton" iconCls="" plain="true" onclick="doDelete()">删除</a>
</div>




<div id="window" class="easyui-window" title="商品" closed="true">
  <form id="windowform">
    <input type="hidden" id="id" name="id" value="">
    <table cellpadding="5">

      <tr>
        <td>名称:</td>
        <td><input class="easyui-textbox" type="text" id="name" name="name" data-options="required:true" style="width: 200px;" /></td>
      </tr>
      <%--<tr>--%>
        <%--<td>真实姓名:</td>--%>
        <%--<td><input class="easyui-textbox" type="text" id="realName" name="realName" data-options="required:false" style="width:200px;" /></td>--%>
      <%--</tr>--%>

    </table>
  </form>
  <div class="form-bottom-buttons">
    <a class="easyui-linkbutton" icon="" href="javascript:void(0);" onclick="submit()">提交</a>
    <a class="easyui-linkbutton" icon="" href="javascript:void(0);" onclick="closeWindow()">取消</a>
  </div>
</div>
</div>

</body>
</html>