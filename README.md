# Pharos-DB-Connector

Pharos DB connector will provide access to the Pharos Database exposing endpoints to execute CRUD operations and criteria based queries.


## Physical model ##

![Pharos Model](Pharos-model.png)

## Endpoints exposed ##

### Health ###

| Endpoint     | GET | POST | PUT | DELETE |
|:-------------|:----|:-----|:----|:-------|
| /api/health  | x   |      |     |        |

### Address ###
| Endpoint                       | GET | POST | PUT | DELETE |
|:-------------------------------|:----|:-----|:----|:-------|
| /api/v1/address/getAddress     | x   |      |     |        |
| /api/v1/address/getAddressList |     | x    |     |        |
| /api/v1/address/createAddress  |     | x    |     |        |
| /api/v1/address/updateAddress  |     |      | x   |        |
| /api/v1/address/deleteAddress  |     |      |     | x      |

### Candidate ###
| Endpoint                             | GET | POST | PUT | DELETE |
|:-------------------------------------|:----|:-----|:----|:-------|
| /api/v1/candidate/getCandidate       | x   |      |     |        |
| /api/v1/candidate/getCandidatesList  |     | x    |     |        |
| /api/v1/candidate/createCandidate    |     | x    |     |        |
| /api/v1/candidate/updateCandidate    |     |      | x   |        |
| /api/v1/candidate/deleteCandidate    |     |      |     | x      |

### Document ###
| Endpoint                             | GET | POST | PUT | DELETE |
|:-------------------------------------|:----|:-----|:----|:-------|
| /api/v1/document/getCandidate        | x   |      |     |        |
| /api/v1/document/getCandidatesList   |     | x    |     |        |
| /api/v1/document/createCandidate     |     | x    |     |        |
| /api/v1/document/updateCandidate     |     |      | x   |        |
| /api/v1/document/deleteCandidate     |     |      |     | x      |

### Gender ###
| Endpoint                      | GET | POST | PUT | DELETE |
|:------------------------------|:----|:-----|:----|:-------|
| /api/v1/gender/getGender      | x   |      |     |        |
| /api/v1/gender/getGenderList  |     | x    |     |        |
| /api/v1/gender/createGender   |     | x    |     |        |
| /api/v1/gender/updateGender   |     |      | x   |        |
| /api/v1/gender/deleteGender   |     |      |     | x      |

### Nationality ###
| Endpoint                               | GET | POST | PUT | DELETE |
|:---------------------------------------|:----|:-----|:----|:-------|
| /api/v1/nationality/getNationality     | x   |      |     |        |
| /api/v1/nationality/getNationality     |     | x    |     |        |
| /api/v1/nationality/createNationality  |     | x    |     |        |
| /api/v1/nationality/updateNationality  |     |      | x   |        |
| /api/v1/nationality/deleteNationality  |     |      |     | x      |