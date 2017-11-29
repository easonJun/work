﻿<%@page contentType="text/html;charset=utf-8" language="java"%>
<%@page isELIgnored="false"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@taglib prefix="jphs" uri="http://www.jinpaihushi.com/jsp/core"%>


<div class="common_right_title">
	<img src="/static/images/yousanjiaox.png" />活动管理 <i class="public1-horn-45"></i>栏目管理 <i class="public1-horn-45"></i>${column.id == null?'新增栏目':'编辑栏目'}
</div>


<form class="form-horizontal add_body" id="goodsForm" method="post" data-role="validate-form" action="/column/insert.jhtml">
	<div class="marage_right_content">
		<div class="clearfix">
			<jphs:hasPermission url="/column/insert.jhtml">
				<button id="save" class="public-info public_btn public_btn_left" data-role="save-btn">保存</button>
			</jphs:hasPermission>
			<input type="button" class="public-info public_btn public_btn_left" name="button1" id="button1"
				value="返回" onclick="history.go(-1)">
		</div>
			<hr class="mt-5" />
		<jsp:include page="form.jsp"></jsp:include>
		<div style="padding-bottom:50px">
		<!-- <button id="save" class="public-info public_btn public_btn_right" data-role="save-btn" style="margin-right:50px;">保存</button> -->
	    </div>
	</div>
</form>





<%-- <div style="margin: 10px 10px 10px 10px;">
	<div class="zw_dqwz">
			您目前所在的位置是：<b>xxxx&nbsp;>>&nbsp;xxxx&nbsp;>>&nbsp;xxxx&nbsp;>>&nbsp;<label
			id="nav_current">xxxx</label>
		</b>
		
	</div>
	<form class="add_body" id="commodityForm" method="post" data-role="validate-form"
		action="/commodity/insert.jhtml">
		<div class="tool_form">
			<div class="wf_btn_left">
				<afocus:privilege url="/commodity/save.jhtml">
					<button type="submit" data-role="save-btn">保存</button>
				</afocus:privilege>
			</div>
		</div>
		
		<div class="con_side">
			<div class="con_side2">
				<div class="event_add_2" >
					<div class="event_handle_body">
						<div style="width: 630px; margin: 0 auto; padding: 10px 0px;">
							<jsp:include page="form.jsp"></jsp:include>
						</div>
					</div>
				</div>
			</div>
		</div>
	</form>
</div>
 --%>