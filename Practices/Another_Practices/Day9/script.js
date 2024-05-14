const inputs = document.querySelectorAll(".form-control");

function AddClass(){
    let parent = this.parentNode.parentNode;
    parent.classList.add("focus");
}

function RemoveClass(){
   let parent = this.parentNode.parentNode;
   if(this.value == ''){
       parent.classList.remove("focus");
   }
}

inputs.forEach(input => {
   input.addEventListener("focus", AddClass);
   input.addEventListener("blur", RemoveClass);
});

