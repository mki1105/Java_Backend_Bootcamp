/**
 * 아이디 중복확인 구현
	중복확인을 클릭하면 아이디 중복에 대한 동작을 할 수 있도록 추가
 */

	
function modifycheck(){
   if(document.regForm.id.value==""){
        alert("아이디를 입력해 주세요.");
        document.regForm.id.focus();
        return;
    }
    if(document.regForm.pass.value==""){
        alert("비밀번호를 입력해 주세요.");
        document.regForm.pass.focus();
        return;
    }
    if(document.regForm.repass.value==""){
        alert("비밀번호를 확인해 주세요.");
        document.regForm.repass.focus();
        return;
    }
	if(document.regForm.pass.value != document.regForm.repass.value){
		alert("비밀번호가 일치하지 않습니다.");
		document.regForm.repass.focus();
	     return;
    }
    if(document.regForm.email.value==""){
        alert("이메일을 입력해 주세요.");
        document.regForm.email.focus();
        return;
    }
}

 