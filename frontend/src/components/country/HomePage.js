/**
 *
 * HomePage: A page that retrieves and displays all contries, where you can navigate to view country details.
 *
 * */


import React, {useEffect, useState} from 'react';
import {Link} from 'react-router-dom';
import {showMessage} from '../../utils/message';
import {getCountries} from "../../services/countryService";
import LoadingSpinner from "../common/LoadingSpinner";

const HomePage = () => {
    const [countries, setCountries] = useState([]);
    const [loading, setLoading] = useState(false);

    useEffect(() => {
        fetchCountries();
    }, []);

    const fetchCountries = async () => {
        setLoading(true);
        try {
            const data = await getCountries();
            setCountries(data);
        } catch (error) {
            showMessage('Error loading countries', 'error');
        } finally {
            setLoading(false);
        }
    };


    if (loading) return <div>{<LoadingSpinner />}</div>;

    return (
        <div>
            {countries ? (
                <div className="home-page">


                    <div className="content-grid">
                        {countries.map((country, idx) => (
                            <Link to={`/country/${country.name}`} key={idx}>
                                <img src={country.flag} alt={country.name} width="100"/>
                                <p>{country.name}</p>
                            </Link>
                        ))}
                    </div>

                </div>
            ) : (
                <p>Loading...</p>
            )}
        </div>
    );
};

export default HomePage;
