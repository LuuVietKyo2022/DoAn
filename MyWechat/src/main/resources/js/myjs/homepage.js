

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
   
    function showListMessages(){
        
        const aChatIcon=document.getElementById("li-chat");
        const divListMessages=document.getElementById("div-listmessages");
        const eleDisplay=divListMessages.style.display;
        console.log(divListMessages.getAttribute("display"));
        var firstClick=1;
        if(firstClick==1){
            divListMessages.style.display="block"; 
            firstClick=0;
        }else{
            if(eleDisplay=="none" || eleDisplay=="null"||eleDisplay==null){
                divListMessages.style.display="block";
            }
            else{
                divListMessages.style.display="none";
            }
        }
            
    }
    function closeLissMessages(){
        const aChatIcon=document.getElementById("li-chat");
        const divListMessages=document.getElementById("div-listmessages");
        const eleDisplay=divListMessages.style.display;
        //console.log(eleDisplay);
            if(eleDisplay=="block"){
                divListMessages.style.display="none";
            }
    }
    function closeCreateNewMessage(){
        const divCreateNewMessage=document.getElementById("div-createNewMessage");
        var eleDisplay=divCreateNewMessage.style.display;
        console.log(eleDisplay);
            if(eleDisplay=="block"||eleDisplay==""){
                divCreateNewMessage.style.display="none";
            }
    }
    function showCreateNewMessage(){
        const divCreateNewMessage=document.getElementById("div-createNewMessage");
        const divListMessages=document.getElementById("div-listmessages");
        //const inputMessage=document.getElementById("my-inputmessage");
        //inputMessage.focus();
        divCreateNewMessage.style.display="block";
        divListMessages.style.display="none";

        
    }
    function inputMessage(){
        const inputMessage=document.getElementById("my-inputmessage");
        const iSend=document.getElementById("i-send-mess");
        if(inputMessage.value!=''){
            iSend.classList.add('bi-send-fill');
            iSend.classList.remove('bi-send');
            iSend.style.color="blue";
        }else{
            iSend.classList.add('bi-send');
            iSend.classList.remove('bi-send-fill');
            iSend.style.color="black";
        }
    }

    // const aChatIcon=document.getElementById("a-chat");
    // const divListMessages=document.getElementById("div-listmessages");
    // aChatIcon.addEventListener('click',()=>{
    //     if(divListMessages.getAttribute("display")=="none"){
    //         divListMessages.setAttribute("display","block");
    //     }else{
    //         divListMessages.setAttribute("display","none");
    //     }
    // })
   