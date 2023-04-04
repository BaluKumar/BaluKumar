function link_page() {
    var name=document.getElementById("UserName").value;
    var pass=document.getElementById("Password").value;
    //helps us to link two pages
    
    if (name=="Balu"&&pass=="balu@123") {
        alert("Hello "+name+" Login Successfully");
        window.location.assign("Script_Html.html");
    } else {
        alert(name+" plse enter valid password");
    }
    
}
function ImageChange() {
    // have to check how to change backgroundimge using same method 
    //it's used to change only attribute value 
    document.getElementById("img2").src="img/alternative.png";
}
