



/**const url = 'https://weather-by-api-ninjas.p.rapidapi.com/v1/weather?city=haldwani&state=uttrakhand&country=india';
const options = {
	method: 'GET',
	headers: {
		'X-RapidAPI-Key': '57c45a6537msh75a899c70bab0bap132c12jsnf352056aaf42',
		'X-RapidAPI-Host': 'weather-by-api-ninjas.p.rapidapi.com'
	}
};

try {
	const response =await fetch(url, options);
	const result = await response.text();
	console.log(result);
} catch (error) {
	console.error(error);
}


const token = 'weather-by-api-ninjas.p.rapidapi.com'; // Replace 'YOUR_AUTH_TOKEN' with your actual authentication token

fetch('https://weather-by-api-ninjas.p.rapidapi.com/v1/weather?city=haldwani&state=uttrakhand&country=india', {
  headers: {
    'Authorization': `Bearer ${token}`
  }
})
.then(response => {
  if (!response.ok) {
    throw new Error('Network response was not ok');
  }
  return response.json();
})
.then(data => {
  // Process the fetched data here
  console.log(data);
})
.catch(error => {
  console.error('There was aa problem with the fetch operation:', error);
});


const apiKey = '57c45a6537msh75a899c70bab0bap132c12jsnf352056aaf42'; // Replace 'YOUR_API_KEY' with your actual API key from OpenWeatherMap

const cityName = 'haldwani'; // Replace 'London' with the name of the city you want weather information for

fetch(`https://weather-by-api-ninjas.p.rapidapi.com/v1/weather?city=haldwani&state=uttrakhand&country=india&appid=${apiKey}`)
  .then(response => {
    if (!response.ok) {
      throw new Error('Network response was not ok');
    }
    return response.json();
  })
  .then(data => {
    // Process the fetched weather data here
    console.log(data);
  })
  .catch(error => {
    console.error('There was a problem with the fetch operation:', error);
  });

  const axios = require('axios');

  const options = {
  method: 'GET',
  url: 'https://weather-by-api-ninjas.p.rapidapi.com/v1/weather',
  params: {city: 'Seattle'},
  headers: {
    'X-RapidAPI-Key': '57c45a6537msh75a899c70bab0bap132c12jsnf352056aaf42',
    'X-RapidAPI-Host': 'weather-by-api-ninjas.p.rapidapi.com'
  }
  };
  
  try {
    const response = await axios.request(options);
    console.log(response.data);
  } catch (error) {
    console.error(error);
  }
**/
// Fetching data from the API
fetch('https://weather.visualcrossing.com/VisualCrossingWebServices/rest/services/timeline/haldwani%2Cindia?unitGroup=metric&key=QNHA8BAWA7ERBYE7VLE9C5JWD&contentType=json')
.then(response => {
  if (!response.ok) {
    throw new Error('Network response was not ok');
  }
  return response.json();
})
.then(data => {
  // Accessing specific elements from the API response
    const currentTemperature = data.currentConditions.temp;
    const currentConditions = data.currentConditions.conditions;

  // Updating HTML elements with API data
    document.getElementById('current-temperature').textContent = currentTemperature + "°C";
    document.getElementById('current-conditions').textContent = currentConditions;
})
.catch(error => {
  // Handling errors
    console.error('There was a problem with the fetch operation:', error);
});

