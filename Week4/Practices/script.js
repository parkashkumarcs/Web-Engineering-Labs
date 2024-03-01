const data = [
    { name: 'Parkash Kumar', age: 24, city: 'Mirpurkhas' },
    { name: 'Danish', age: 25, city: 'Larkana' },
    { name: 'Shoaib Ali', age: 25, city: 'Tando Jaam' },
    { name: 'Teerth', age: 24, city: 'Nangar Parkar' },
];

function generateTable(data) {
    const tableContainer = document.getElementById('Container');
    const table = document.createElement('table');
    table.classList.add('myTable');
    const headerRow = document.createElement('tr');
    for (const key in data[0]) {
        const th = document.createElement('th');
        th.textContent = key;
        headerRow.appendChild(th);
    }
    table.appendChild(headerRow);
    data.forEach(item => {
        const row = document.createElement('tr');
        for (const key in item) {
            const td = document.createElement('td');
            td.textContent = item[key];
            row.appendChild(td);
        }
        table.appendChild(row);
    });
    tableContainer.appendChild(table);
}
generateTable(data);
