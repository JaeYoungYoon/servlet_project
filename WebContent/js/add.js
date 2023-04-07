function add() {

	var v_jumin = document.getElementById("v_jumin");

	if (v_jumin.value.length == "") {
		alert("주민번호가 입력되지 않았습니다!");

		return false;
	}
	
	var v_name = document.getElementById("v_name");
	
	if (v_name.value.length == "") {
		alert("성명이 입력되지 않았습니다!");

		return false;
	}
	
	var m_no = document.getElementById("m_no");
	
	if (m_no.value.length == "") {
		alert("후보번호가 입력되지 않았습니다!");
		
		return false;
	}
	var v_time = document.getElementById("v_time");
	
	if (v_time.value.length == "") {
		alert("투표시간이 입력되지 않았습니다!");
		
		return false;
	}
	var v_area = document.getElementById("v_area");
	
	if (v_area.value.length == "") {
		alert("투표장소가 입력되지 않았습니다!");
		
		return false;
	}
	var v_confirm = document.getElementById("v_confirm");
	
	if (v_confirm.value == "") {
		alert("유권자확인이 선택되지 않았습니다!");
		
		return false;
	}
	success();
	
	return true;
}
function success() {
	alert("투표하기 정보가 정상적으로 등록 되었습니다!");
}