﻿<%@page contentType="text/html;charset=utf-8" language="java"%>
<%@page isELIgnored="false"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@taglib prefix="jphs" uri="http://www.jinpaihushi.com/jsp/core"%>
<div class="common_right_title">
	<img src="/static/images/yousanjiaox.png" />产品管理<i class="public1-horn-45"></i>站点管理<i class="public1-horn-45"></i>站点列表 
</div>
<div class="marage_right_title">
	<jsp:include page="search.jsp"></jsp:include>
</div>

<div class="marage_right_content">
	<!-- 左对齐按钮 -->
	<jphs:hasPermission url="/site/redirectAddPage.jhtml">
		<button id="redirectAddPage" type="button" class="public-info">新建站点</button>
	</jphs:hasPermission>
	
	<!-- 右对齐按钮 -->
	<!-- <button type="button" class="btn btn-info public_btn public_btn_right">添加品类</button> -->
	
	<jsp:include page="list.jsp"></jsp:include>

</div>