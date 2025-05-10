import axios from 'axios';

const API_URL = 'http://localhost:8080/backend/api'; // Replace with the actual URL of your Java backend


// Get all countries
export const getCountries = async () => {
    try {
        console.log("... get all countries")
        const response = await axios.get(API_URL + '/countries');
        return response.data;
    } catch (error) {
        throw error.response ? error.response.data : error.message;
    }
};

// Get country by Name
export const getCountryByName = async (countryName) => {
    try {
        console.log("...get country by name : "+ countryName);
        const response = await axios.get(`${API_URL + '/countries/'}${countryName}`);
        return response.data;
    } catch (error) {
        throw error.response ? error.response.data : error.message;
    }
};
