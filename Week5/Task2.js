const car = {
    brand: 'Toyota',
    model: 'Camry',
    year: 2022
};

function carInfo(carObject) {
    const { brand, model, year } = carObject;

    const infoString = `The ${brand} ${model} was manufactured in ${year}.`;

    return infoString;
}

const carInformation = carInfo(car);
document.getElementById('Container').innerHTML = carInformation;
