



function createUserName(){
    const firstName=document.getElementById('firstName').value;
    const lastName=document.getElementById('lastName').value;
    const firstNameLastName=document.getElementById('firstNameLastName');
    const lastNameFirstName=document.getElementById('lastNameFirstName');
    firstNameLastName.value=firstName+lastName;
    lastNameFirstName.value=lastName+firstName;

}

function ajaxPost(){
	var avatarInput = document.getElementById('avatar');
	var formData = new FormData();
			
	formData.append('lastname', document.getElementById('lastname').value);
    formData.append('firstname', document.getElementById('firstname').value);
    formData.append('username', document.getElementById('username').value);
    formData.append('gender', document.getElementById('gender').value);
    formData.append('birthday', document.getElementById('birthday').value);
    formData.append('address', document.getElementById('address').value);
    formData.append('address2', document.getElementById('address2').value);
    formData.append('avatar', avatarInput.files[0]);
	
	
	$.ajax({
		type:"POST",
		contentType: false,
		url:location.pathname,
		contentType: false,
        processData: false,
		data:formData,
		success:function (result){
			console.log("here");
		} 

	})
}
