



function createUserName(){
    const firstName=document.getElementById('firstName').value;
    const lastName=document.getElementById('lastName').value;
    const firstNameLastName=document.getElementById('firstNameLastName');
    const lastNameFirstName=document.getElementById('lastNameFirstName');
    firstNameLastName.value=firstName+lastName;
    lastNameFirstName.value=lastName+firstName;

}
