<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<META http-equiv="Content-Type" content="text/html; charset=UTF-8">
<%
    String basePath = "/";
%>
<script>
    var ctx="/";
</script>


<c:set var="ctx" scope="request" value="<%=basePath%>"/>


<link rel="stylesheet" type="text/css" href="<%=basePath%>static/easyui/themes/default/easyui.css">
<link rel="stylesheet" type="text/css" href="<%=basePath%>static/easyui/themes/icon.css">
<link rel="stylesheet" type="text/css" href="<%=basePath%>static/css/common.css">
<script type="text/javascript" src="<%=basePath%>static/easyui/jquery.min.js"></script>
<script type="text/javascript" src="<%=basePath%>static/easyui/jquery.easyui.min.js"></script>

<script type="text/javascript" src="<%=basePath%>static/easyui/plugins/jquery.linkbutton.js"></script>
<script type="text/javascript" src="<%=basePath%>static/easyui/plugins/jquery.form.js"></script>
<script type="text/javascript" src="<%=basePath%>static/easyui/plugins/jquery.window.js"></script>
<script type="text/javascript" src="<%=basePath%>static/easyui/plugins/jquery.datagrid.js"></script>
<script type="text/javascript" src="<%=basePath%>static/easyui/plugins/jquery.pagination.js"></script>
<script type="text/javascript" src="<%=basePath%>static/easyui/plugins/jquery.combobox.js"></script>
<script type="text/javascript" src="<%=basePath%>static/easyui/plugins/jquery.textbox.js"></script>
<script type="text/javascript" src="<%=basePath%>static/easyui/plugins/jquery.numberbox.js"></script>
<script type="text/javascript" src="<%=basePath%>static/easyui/plugins/jquery.combotree.js"></script>
<script type="text/javascript" src="<%=basePath%>static/easyui/plugins/jquery.datebox.js"></script>
<script type="text/javascript" src="<%=basePath%>static/easyui/plugins/jquery.filebox.js"></script>
<script type="text/javascript" src="<%=basePath%>static/easyui/plugins/jquery.tree.js"></script>
<script type="text/javascript" src="<%=basePath%>static/easyui/plugins/jquery.dialog.js"></script>


<script type="text/javascript" src="<%=basePath%>static/easyui/locale/easyui-lang-zh_CN.js"></script>
