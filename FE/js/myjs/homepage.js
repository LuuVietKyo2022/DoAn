

    const modalCreateStatus=document.getElementById("modal-createstatus");
    const inputCreateStatus=document.getElementById("inputCreateStatus");
    modalCreateStatus.addEventListener('show.bs.modal', ()=>{
        inputCreateStatus.focus();
    })
    const btnCloseStatusForm=document.getElementById("btn-close-createstatus");
    modalCreateStatus.addEventListener('show.bs.modal', ()=>{
        inputCreabtnCloseStatusFormteStatus.click();
    })

    modalCreateStatus.onclick(function(){
        modalCreateStatus.hide();
    })