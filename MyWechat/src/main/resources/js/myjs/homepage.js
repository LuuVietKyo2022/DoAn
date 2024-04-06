var isFirstImg=true;
var backgroundId;
var emoteId;
var indexImg=1;
var listImage=[];


    const modalCreateStatus=document.getElementById("modal-createstatus");
    const inputCreateStatus=document.getElementById("inputCreateStatus");
    modalCreateStatus.addEventListener('show.bs.modal', ()=>{
		
        //inputCreateStatus.focus();
    })
    const btnCloseStatusForm=document.getElementById("btn-close-createstatus");
    modalCreateStatus.addEventListener('hide.bs.modal', ()=>{
        //btnCloseStatusForm.click();
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

 	function focusImageInput(){
		 // Tạo element input type file
  		const inputFile = document.createElement("input");
  		inputFile.type = "file";
  		inputFile.id = "listImgs";
  		inputFile.accept = "image/*";
  		inputFile.style.display = "none";

  		// Thêm event listener cho inputFile để xử lý khi chọn ảnh
  		inputFile.addEventListener("change", function() {
		
    	const file = inputFile.files[0];
    	listImage.push(inputFile.files[0]);
    	// Xử lý file được chọn (upload, hiển thị ảnh, ...)
    	const reader=new FileReader();
    	reader.readAsDataURL(file);
    	reader.onload = function(){
		const divshowImage=document.getElementById("div-showimage");
		
		var now=new Date();
		var id=now.getTime();
			const img=document.createElement("img");
    		img.width="80";
    		img.height="82";
    		img.src =reader.result;
    		img.id=id;
    		img.classList="images";
    		divshowImage.appendChild(img);
    		indexImg++;
    		isFirstImg=false;
    		const iconX=document.createElement("i");
    		iconX.classList="bi bi-x-lg";
    		iconX.style.position="relative";
    		iconX.style.top="-28px";
    		iconX.style.right="18px";
    		iconX.style.color="white";
    		iconX.style.fontWeight="bold";
    		iconX.style.cursor="pointer";
    		iconX.id=id;
    		divshowImage.appendChild(iconX);
    		iconX.addEventListener("click",function(){
				var listImages = document.getElementsByClassName("images");
				for(var img of listImages){
					if(img.id==iconX.id){
						divshowImage.removeChild(img);
						img.style.display="none";
						iconX.style.display="none";
						break;
					}
					
				}
			})
		
		}
    	

  		});

  		// Gắn inputFile vào body và click để mở trình chọn ảnh
  		document.body.appendChild(inputFile);
  		inputFile.click();
  		document.body.removeChild(inputFile);
	 }
	 
function setBackgroundStatus(id){
	backgroundId=id;
	var imgTemplateBackground=document.getElementById(id);
	var srcImg=imgTemplateBackground.src;
	var inputStatus=document.getElementById('inputStatus');
	inputStatus.style.width="430px";
	inputStatus.style.height="620px";
	inputStatus.style.backgroundImage= `url(${srcImg})`;
	inputStatus.style.textAlign= "center";
	inputStatus.style.display="flex";
	inputStatus.style.alignItems="center";
	inputStatus.style.fontWeight="bold";
	inputStatus.style.fontSize="28px";
	inputStatus.focus();
}
function openSetBackgroundTemplate(){
	const iImage=document.getElementById('i-images');
	const divImgTemplate=document.getElementById('div-templatebackground');
	if(divImgTemplate.classList.contains("d-flex")){
		divImgTemplate.classList.remove("d-flex");
		divImgTemplate.classList.remove("flex-row");
		divImgTemplate.style.display="none";
		iImage.style.pointerEvents="auto";
		iImage.style.color="#41B35D";
	}
	else if(divImgTemplate.style.display=="none"||divImgTemplate.style.display==""){
		divImgTemplate.classList.add("d-flex");
		divImgTemplate.classList.add("flex-row");
		iImage.style.pointerEvents="none";
		iImage.style.color="#D9D9D9";

		
	}
}
function openListEmotesOrListAction(isListRemote){
	var divEmotes=document.getElementById('div-listEmotes');
	var divActions=document.getElementById('div-listActions');
	console.log("hello");
	if(isListRemote=="false"){
		divActions.classList.remove("d-none");
		divActions.classList.add("d-flex");
		divEmotes.classList.remove("d-flex");
		divEmotes.classList.add("d-none");
	}else{
		divEmotes.classList.remove("d-none");
		divEmotes.classList.add("d-flex");
		divActions.classList.remove("d-flex");
		divActions.classList.add("d-none");
	}
}
function openListEmoteAction(){

	var divEmoteAction=document.getElementById('div-emoteaction');
	if(divEmoteAction.style.display=="none"||divEmoteAction.style.display==""){
		divEmoteAction.style.display="block";
	}else{
		divEmoteAction.style.display="none";
	}
}

function clickEmote(id){
	const cardTiltle=document.getElementById('card-title');
	var emote=document.getElementById(id);
	emoteId=id;
	if(cardTiltle.textContent.includes(" đang ")){
		var username=cardTiltle.textContent.substring(0, cardTiltle.textContent.indexOf("đang"));
		cardTiltle.innerHTML=username+" đang "+emote.innerHTML;
	}
	else{
		cardTiltle.innerHTML=cardTiltle.innerHTML+" đang "+emote.innerHTML;
	}
	
}
function openOrCloseTagFriend(){
	const divTagFriend=document.getElementById('div-tagfriend');
	if(divTagFriend.style.display=="none"||divTagFriend.style.display==""){
		divTagFriend.style.	display="block";
	}else{
		divTagFriend.style.	display="none";
	}
}
function clickPostStatus(){
	var formData=new FormData();
	const inputContent=document.getElementById("inputStatus");
	const inputUserId=document.getElementById("userid");
	const selectScope=document.getElementById("select-scope");
	formData.append("userId",inputUserId.value);
	if(listImage.length!=0){
		for(var img of listImage){
			formData.append("postImages",img);
		}
		
		
	}else{
		formData.append("postImages",null);
	}
	console.table(listImage);
	inputContent.value!="" ? formData.append("content",inputContent.value) : formData.append("content","");
	backgroundId!=undefined ? formData.append("backgroundId",backgroundId) : formData.append("backgroundId","");
	emoteId!=undefined ? formData.append("emoteId",emoteId) : formData.append("emoteId","");
	formData.append("scope",selectScope.value);
	//console.log(formData);
	$.ajax({
		type:"POST",
		url:"/createstatus",
		data:formData,
		processData:false,
		contentType:false,
		success:function(result){
			// Cài đặt URL mới
			window.location.href = "/home";

			// Tải lại trang
			window.location.reload();

			
		},
		error:function(result){
			console.table(result);
		}
	})
	
}
