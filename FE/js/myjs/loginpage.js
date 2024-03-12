function showOrHidePass(){
    const inputPassword = document.getElementById('floatingPassword');
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
// function rememberLogin(){
//     const checkBoxRemember = document.getElementById('flexCheckDefault');
//     var password =document.getElementById('floatingPassword').value; 
//     var username=document.getElementById('floatingInput').value;
//         if(checkBoxRemember.checked){
//             //const hasedPassword=sha256(password);
//             localStorage.setItem('username',username);
//             localStorage.setItem('password',password);
//         }else{
//             localStorage.clear();
//         }
    
// }
// function inputUserNameOrPass(){
//     var password =document.getElementById('floatingPassword') 
//     var username=document.getElementById('floatingInput');
//     username.value=localStorage.getItem('username');
//     password.value=localStorage.getItem('password');
// }