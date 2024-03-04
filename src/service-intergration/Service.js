import axios from "axios";
import React, { useEffect, useState } from "react";

const Service = () => {
  useEffect(() => {
    getDoctorDetails();
  }, []);
  const [doctor, setDoctor] = useState([]);

  const getDoctorDetails = () => {
    let url = "http://localhost:8080/doctorconsultation/doctors";
    axios
      .get(url, {
        headers: {

        },
      })
      .then((response) => {
        if (response.status === 200) {
          let data = response.data.map((item) => {
            return (
              <tr>
                <td>{item.doc_name}</td>
                <td>{item.doc_qualification}</td>
              </tr>
            );
          });
          setDoctor(data);
        }
      })
      .catch((err) => {
        alert("error");
      });
  };

  return (
    <div>
      <h2>Service for Get</h2>
      {doctor}
    </div>
  );
};

export default Service;
