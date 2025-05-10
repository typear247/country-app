import React, {useEffect, useState} from 'react';
import {useNavigate, useParams} from 'react-router-dom';
import {getCountryByName} from "../../services/countryService";
import {showMessage} from "../../utils/message";
import '../assets/css/popup.css'
import LoadingSpinner from "../common/LoadingSpinner";

const DetailScreen = () => {

    const {countryName} = useParams();
    const [countryDetails, setCountryDetails] = useState({name: '', capital: '', population: '', flag: ''});
    const [loading, setLoading] = useState(false);
    const navigate = useNavigate();

    const [showPopup, setShowPopup] = useState(false);
    const togglePopup = () => setShowPopup(!showPopup);


    useEffect(() => {
        const fetchCountryDetails = async () => {
            setLoading(true);
            try {
                const data = await getCountryByName(countryName);
                setCountryDetails(data);
            } catch (error) {
                showMessage('Error fetching country data', 'error');
            } finally {
                setLoading(false);
            }
        };

        fetchCountryDetails();
    }, [countryName]);


    const handleCancel = async () => {
        navigate('/');
    };

    if (loading) return <div>{<LoadingSpinner />}</div>;

    return (

        <div className="page-container">
            <div className="details-table">
                <div className="left-column">
                    <img
                        src={countryDetails.flag}
                        alt={countryDetails.name}
                        className="country-image"
                    />
                </div>
                <div className="right-column">
                    <p><strong>Name:</strong> {countryDetails.name}</p>
                    <p><strong>Capital:</strong> {countryDetails.capital}</p>
                    <p><strong>Population:</strong> {countryDetails.population}</p>
                </div>
            </div>
            <div className="button-group">
                <button type="submit" className="btn btn-success" onClick={handleCancel}>Back</button>
                <button type="submit" className="btn btn-warning" onClick={togglePopup} >Edit</button>
                <button type="submit" className="btn btn-danger" onClick={togglePopup}>Delete</button>
            </div>



            {showPopup && (
                <div className="popup-overlay" onClick={togglePopup}>
                    <div className="popup-content" onClick={e => e.stopPropagation()}>
                        <h2>Comming soon...</h2>
                        <p>This feature coming soon.... Adolph didnt have enough time to implement this</p>
                        <button className="close-btn" onClick={togglePopup}>Cool</button>
                    </div>
                </div>
            )}


        </div>

    );
};

export default DetailScreen;
