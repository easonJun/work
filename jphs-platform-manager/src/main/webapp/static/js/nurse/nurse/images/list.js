$(function() {
	$("#redirectAddPage").on("click", function() {
		window.location.href = "/nurse/images/redirectAddPage.jhtml";
	});
	// 清除
	$("#clear").on("click", function() {
		$("input[type='text']").val("");
	});

});

function redirectUpdatePage(id) {
	window.location.href = "/nurse/images/redirectUpdate.jhtml?id=" + id;
}
function redirectDetailPage(id) {
	window.location.href = "/nurse/images/detail.jhtml?id=" + id;
}
function deleteById(id) {
	window.location.href = "/nurse/images/delete.jhtml?id=" + id;
}
