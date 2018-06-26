<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="contextPath" value="${pageContext.request.contextPath}"></c:set>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>

<!-- LayUI核心的css文件 -->
<link rel="stylesheet" href="${contextPath }/static/layui/css/layui.css">

<!--  最新的layui 核心 JavaScript 文件  -->
<script src="${contextPath }/static//layui/layui.js "></script>
<!-- 对移动设备更好的支持 -->
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<!-- 新 Bootstrap 核心 CSS 文件 -->
<link rel="stylesheet"
	href="${contextPath }/static/bootstrap/css/bootstrap.min.css">
<!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
<script
	src="${contextPath }/static/bootstrap/jquery/jquery-2.1.1.min.js"></script>

<!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
<script src="${contextPath }/static/bootstrap/js/bootstrap.min.js"></script>
<!-- highcharts的基础引用 -->
<script src="${contextPath }/static/Highcharts/code/highcharts.js"></script>
<!-- highcharts例如启用导出功能时需要引入的文件及顺序是： -->
<script
	src="${contextPath }/static/Highcharts/code/modules/exporting.js"></script>
<!-- ////////////////////////// -->
<!-- 新 Bootstrap 核心 CSS 文件 -->

</head>
<body>
	<div class="panel panel-default">
		<div class="panel-heading">面板标题</div>
		<div class="panel-body">
			<p>这是一个基本的面板内容。这是一个基本的面板内容。 这是一个基本的面板内容。这是一个基本的面板内容。
				这是一个基本的面板内容。这是一个基本的面板内容。 这是一个基本的面板内容。这是一个基本的面板内容。</p>
		</div>
		<ul class="list-group">
			<li class="list-group-item">免费域名注册</li>
			<li class="list-group-item">免费 Window 空间托管</li>
			<li class="list-group-item">图像的数量</li>
			<li class="list-group-item">24*7 支持</li>
			<li class="list-group-item">每年更新成本</li>
		</ul>
	</div>
	<div class="well well-lg">您好，我在大的 Well 中！</div>
	<div class="well well-sm">您好，我在小的 Well 中！</div>
</body>
<h2>创建模态框（Modal）</h2>
<!-- 按钮触发模态框 -->
<button class="btn btn-primary btn-lg" data-toggle="modal"
	data-target="#myModal">开始演示模态框</button>

<div class="modal fade" id="myModal" tabindex="-1" role="dialog"
	aria-labelledby="myModalLabel" aria-hidden="true">
	<div class="modal-dialog">
		<div class="modal-content">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal"
					aria-hidden="true">×</button>
				<h4 class="modal-title" id="myModalLabel">模态框（Modal）标题</h4>
			</div>
			<div class="modal-body">按下 ESC 按钮退出.</div>
			<div class="modal-footer">
				<button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
				<button type="button" class="btn btn-primary">提交更改</button>
			</div>
		</div>
		<!-- /.modal-content -->
	</div>
	<!-- /.modal-dialog -->
</div>

<script>
	
</script>
</html>