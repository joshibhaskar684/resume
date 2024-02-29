
fetch('https://weather.visualcrossing.com/VisualCrossingWebServices/rest/services/timeline/haldwani%2Cindia?unitGroup=metric&key=QNHA8BAWA7ERBYE7VLE9C5JWD&contentType=json')
  .then(response => {
    if (!response.ok) {
      throw new Error('Network response was not ok');
    }
    return response.json();
  })
  .then(data => {
    // Do something with the data
    console.log(data);
  })
  .catch(error => {
    // Handle errors
    console.error('There was a problem with the fetch operation:', error);
  });


