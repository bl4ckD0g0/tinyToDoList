'use strict'

let task_input = document.getElementById('task_input');

task_input.addEventListener('keypress', (event) =>
    {
        if(event.key === 'Enter'){
            insertTask(task_input.value);
            task_input.value = '';
        }
    });

function insertTask(task_name){
    console.log(task_name);

    //FIXME esta creacion manual de el elemnto HTML es un poco chunga
    let li = document.createElement('li');
    li.classList.add('task_mini');

    let h2 = document.createElement('h2');
    h2.classList.add('task_mini_head');
    h2.textContent = task_name;

    let btn_borrar = document.createElement('input');
    btn_borrar.classList.add('btn_task_delete');
    btn_borrar.title = 'Borrar';
    btn_borrar.type = 'button'

    li.appendChild(h2);
    li.appendChild(btn_borrar);


    //FIXME un poco chunga la seleccion
    let ol = document.querySelectorAll('#list_todo .list_body > ol')[0];
    li.style.transform = 'scale(0, 0)';
    ol.appendChild(li);
    animateGrow(li);

    btn_borrar.addEventListener('click', (event) =>
        {
            //TODO borrar la tarea en el servidor
            deleteTask(li);
        });

    //TODO Crear la task en el servidor
}


function deleteTask(task){
    animateShrink(task);
    //TODO borrar la tarea en el servidor
}


function animateGrow(elemento_HTML){
    let size = 0;
    let t = setInterval(function ()
    {
        elemento_HTML.style.transform = `scale(${size}, ${size}`;
        size += 0.06;
        if(size => 1) {
            clearInterval(t);
            elemento_HTML.style.transform = 'scale(1, 1)';
        }
    }, 33);
}


function animateShrink(elemento_HTML){
    let size = 1;
    let t = setInterval(function ()
    {
        elemento_HTML.style.transform = `scale(${size}, ${size}`;
        size -= 0.06;
        if(size <= 0) {
            clearInterval(t);
            elemento_HTML.remove();
        }
    }, 33);
}
