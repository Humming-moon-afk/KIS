async function sendData() {
    const nameValue = document.getElementById('name').value;
    const ageValue = document.getElementById('age').value;
    const heightValue = document.getElementById('height').value;

    if (!nameValue || !ageValue || !heightValue) {
        alert("Please fill out everything");
        return;
    }
    const patientData = {
        name: nameValue,
        age: parseInt(ageValue),     
        height: parseInt(heightValue) 
    };

    try {
        const response = await fetch('http://localhost:8080/api/patients', {
            method: 'POST',
            headers: {
                'Content-Type': 'application/json'
            },
            body: JSON.stringify(patientData) 
        });
        if (response.ok) {
            const result = await response.json();
            
            const responseDiv = document.getElementById('response');
            responseDiv.style.display = 'block';
            responseDiv.style.color = 'green';
            responseDiv.innerText = `Success! Patiennt ${result.name} was saved with ID ${result.id}`;
            
            document.getElementById('name').value = '';
            document.getElementById('age').value = '';
            document.getElementById('height').value = '';
        } else {
            throw new Error('Server-Antwort war nicht okay.');
        }

    } catch (error) {
        console.error("Error: ", error);
        alert("Server is unavailable");
    }
}