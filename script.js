let input = document.getElementById('inputBox');
let buttons = document.querySelectorAll('button');

let string = "";
let arr = Array.from(buttons);
arr.forEach(button => {
button.addEventListener('click',(e)=>{
    if(e.target.innterHTML == '='){
        String = eval(String);
        input.value = String;
    }

    string += e.target.innterHTML;
    input.value = String;
    
})