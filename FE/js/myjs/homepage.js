

    const modalCreateStatus=document.getElementById("modal-createstatus");
    const inputCreateStatus=document.getElementById("inputCreateStatus");
    modalCreateStatus.addEventListener('show.bs.modal', ()=>{
        inputCreateStatus.focus();
    })
    const btnCloseStatusForm=document.getElementById("btn-close-createstatus");
    modalCreateStatus.addEventListener('show.bs.modal', ()=>{
        inputCreabtnCloseStatusFormteStatus.click();
    })

   // modalCreateStatus.onclick(function(){
    //    modalCreateStatus.hide();
    //})
    function clickHeart(){
        const btnLightHeart=document.getElementById("btn-heart");
        const iLightHeart=document.getElementById("i-lightheart");
        if(iLightHeart.classList.contains("bi-heart")){
            iLightHeart.classList.add('bi-heart-fill');
            iLightHeart.classList.remove('bi-heart');
            iLightHeart.style.color="red";
        }else{
            iLightHeart.classList.add('bi-heart');
            iLightHeart.classList.remove('bi-heart-fill');
            iLightHeart.style.color="black";
        }
        
    }

    function inputComment(){
        const inputComment=document.getElementById("my-inputcomment");
        const iSend=document.getElementById("i-send");
        if(inputComment.value!=''){
            iSend.classList.add('bi-send-fill');
            iSend.classList.remove('bi-send');
            iSend.style.color="blue";
        }else{
            iSend.classList.add('bi-send');
            iSend.classList.remove('bi-send-fill');
            iSend.style.color="black";
        }
    }
    const btnCreateComment=document.getElementById("btn-create-comment");
    const inputComment2=document.getElementById("my-inputcomment");
    btnCreateComment.addEventListener('click',()=>{
        inputComment2.focus();
    })
   

    
   