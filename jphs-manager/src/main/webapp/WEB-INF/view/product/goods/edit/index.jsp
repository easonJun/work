﻿<%@page contentType="text/html;charset=utf-8" language="java"%>
<%@page isELIgnored="false"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@taglib prefix="jphs" uri="http://www.jinpaihushi.com/jsp/core"%>
<div class="common_right_title">
	<img src="/static/images/yousanjiaox.png" />服务管理 <i class="public1-horn-45"></i>${goods.id == null?'添加服务':'编辑服务'}
</div>
<form class="form-horizontal add_body" id="goodsForm" method="post" data-role="validate-form" action="/goods/insert.jhtml">
	<div class="marage_right_content">
		<div class="clearfix">
			<jphs:hasPermission url="/goods/insert.jhtml">
				<button id="save" class="public-info public_btn public_btn_left" data-role="save-btn">保存</button>
			</jphs:hasPermission>
			<input type="button" class="public-info public_btn public_btn_left" name="button1" id="button1"
				value="返回" onclick="history.go(-1)">
		</div>
			<hr class="mt-5" />
		<jsp:include page="form.jsp"></jsp:include>
		<div style="padding-bottom:50px">
		<button id="save" class="public-info public_btn public_btn_right" data-role="save-btn" style="margin-right:50px;">保存</button>
	    </div>
	</div>
</form>