function sendData() {
    const nameInput = document.getElementById('name');
    const ageInput = document.getElementById('age');
    const heightInput = document.getElementById('height');

    const patientData = {
        name: nameInput.value,
        age: parseInt(ageInput.value),
        height: parseInt(heightInput.value)
    };

    
}