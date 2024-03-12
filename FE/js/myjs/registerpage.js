function showOrHidePass(){
    const inputPassword = document.getElementById('exampleInputPassword1');
    const ishowOrHidePass=document.getElementById('btn-showpass');
    if(ishowOrHidePass.classList.contains('bi-eye-slash-fill')){
        inputPassword.setAttribute("type","text");
        ishowOrHidePass.classList.remove("bi-eye-slash-fill");
        ishowOrHidePass.classList.add("bi-eye-fill");
    }else{
        inputPassword.setAttribute("type","password");
        ishowOrHidePass.classList.remove("bi-eye-fill");
        ishowOrHidePass.classList.add("bi-eye-slash-fill");
    }
}
function showOrHidePass2(){
    const inputPassword = document.getElementById('exampleInputPassword2');
    const ishowOrHidePass=document.getElementById('btn-showpass2');
    if(ishowOrHidePass.classList.contains('bi-eye-slash-fill')){
        inputPassword.setAttribute("type","text");
        ishowOrHidePass.classList.remove("bi-eye-slash-fill");
        ishowOrHidePass.classList.add("bi-eye-fill");
    }else{
        inputPassword.setAttribute("type","password");
        ishowOrHidePass.classList.remove("bi-eye-fill");
        ishowOrHidePass.classList.add("bi-eye-slash-fill");
    }
}