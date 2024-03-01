document.addEventListener('DOMContentLoaded', function () {
    const todoForm = document.getElementById('Form');
    const newTaskInput = document.getElementById('newTask');
    const taskList = document.getElementById('taskList');

    todoForm.addEventListener('submit', function (event) {
        event.preventDefault();

        const taskText = newTaskInput.value.trim();

        if (taskText !== '') {
            addTask(taskText);
            newTaskInput.value = '';
        }
    });

    function addTask(taskText) {
        const taskItem = document.createElement('li');
        const taskCheckbox = document.createElement('input');
        const taskLabel = document.createElement('label');

        taskCheckbox.type = 'checkbox';
        taskLabel.textContent = taskText;

        taskItem.appendChild(taskCheckbox);
        taskItem.appendChild(taskLabel);

        taskList.appendChild(taskItem);

        taskCheckbox.addEventListener('change', function () {
            if (taskCheckbox.checked) {
                taskItem.classList.add('completed');
            } else {
                taskItem.classList.remove('completed');
            }
        });
    }
});
