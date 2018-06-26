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
<!-- highcharts例如启用导出功能时需要引入的文件及顺序是： -->
<script
	src="${contextPath }/static/Highcharts/code/modules/exporting.js"></script>


<!-- ////////////////////////// -->
<!-- 新 Bootstrap 核心 CSS 文件 -->

</head>

<body>

	<!-- 轮播框 -->
	<div class="layui-carousel" id="test1">
		<div carousel-item>
			<div>条目1</div>
			<div>条目2</div>
			<div>条目3</div>
			<div>条目4</div>
			<div>条目5</div>
		</div>
	</div>
	<!-- 条目中可以是任意内容，如：<img src=""> -->


	<script>
		layui.use('carousel', function() {
			var carousel = layui.carousel;
			//建造实例
			carousel.render({
				elem : '#test1',
				width : '100%' //设置容器宽度
				,
				arrow : 'always' //始终显示箭头
			//,anim: 'updown' //切换动画方式
			});
		});
	</script>
	<table id="demo" lay-filter="test"></table>

	<!-- 数据表格 -->
	<script>
		layui.use('table', function() {
			var table = layui.table;

			//第一个实例
			table.render({
				elem : '#demo',
				height : 315,
				url : '${contextPath }/static/user.json' //数据接口
				,
				page : true //开启分页
				,
				cols : [ [ //表头
				{
					field : 'id',
					title : 'ID',
					width : 80,
					sort : true,
					fixed : 'left'
				}, {
					field : 'username',
					title : '用户名',
					width : 80
				}, {
					field : 'sex',
					title : '性别',
					width : 80,
					sort : true
				}, {
					field : 'city',
					title : '城市',
					width : 80
				}, {
					field : 'sign',
					title : '签名',
					width : 177
				}, {
					field : 'experience',
					title : '积分',
					width : 80,
					sort : true
				}, {
					field : 'score',
					title : '评分',
					width : 80,
					sort : true
				}, {
					field : 'classify',
					title : '职业',
					width : 80
				}, {
					field : 'wealth',
					title : '财富',
					width : 135,
					sort : true
				} ] ]
			});

		});
	</script>
	<div id="test"></div>

	<script>
		layui.use('util', function() {
			var util = layui.util;

			//示例
			var endTime = new Date(2019, 1, 1).getTime() //假设为结束日期
			, serverTime = new Date().getTime(); //假设为当前服务器时间，这里采用的是本地时间，实际使用一般是取服务端的

			util.countdown(endTime, serverTime, function(date, serverTime,
					timer) {
				var str = date[0] + '天' + date[1] + '时' + date[2] + '分'
						+ date[3] + '秒';
				layui.$('#test').html('距离2019年1月1日还有：' + str);
			});
		});
	</script>
	<script>
		layui.use('util', function() {
			var util = layui.util;

			//执行
			util.fixbar({
				bar1 : true,
				click : function(type) {
					console.log(type);
					if (type === 'bar1') {
						alert('点击了bar1')
					}
				}
			});
		});
	</script>

	</div>
</body>
</html>