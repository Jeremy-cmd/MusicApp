import logo from './logo.svg';
import './App.css';
import React, {useState, useEffect} from "react";
import {Buffer} from 'buffer';

function App() {
  var client_id = process.env.REACT_APP_CLIENT_ID;
  var client_secret = process.env.REACT_APP_CLIENT_SECRET;


  useEffect(() => {

    fetch('http://localhost:8081/music/getToken/' + client_id + '/' + client_secret, {
       method: 'POST',
       headers: new Headers({
         'Authorization': 'Basic '+ (new Buffer(client_id + ':' + client_secret).toString('base64')),
         'Content-Type': 'application/x-www-form-urlencoded'
       }),
       form: {
         grant_type: 'client_credentials'
       },
       mode: 'cors',
       json: true
     }).then(response => response.json())
        .then(res => console.log(res));

  }, []);



  return (
    <div className="App">

    </div>
  );
}

export default App;
