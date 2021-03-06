package com.addressbook;

public class Address {
    //declaring variables
    //using geter and seter for address details
        private String firstname;
        private String lastname;
        private String city;
        private String state;
        private String zip;
        private String phoneNumber;
        private String email;

        public String getFirstname() {
            return firstname;
        }
        public void setFirstname(String firstname) {
            this.firstname = firstname;
        }
        public String getLastname() {
            return lastname;
        }
        public void setLastname(String lastname) {
            this.lastname = lastname;
        }
        public String getCity() {
            return city;
        }
        public void setCity(String city) {
            this.city = city;
        }
        public String getState() {
            return state;
        }
        public void setState(String state) {
            this.state = state;
        }
        public String getZip() {
            return zip;
        }
        public void setZip(String zip) {
            this.zip = zip;
        }
        public String getEmail() {
        return email;
    }
        public void setEmail(String email) {
        this.email = email;
    }
        public String getPhoneNumber() {
            return phoneNumber;
        }
        public void setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
        }


        @Override
        public String toString() {
            return "AddressBook [firstname=" + firstname + ", lastname=" + lastname + ", city=" + city + ", state=" + state
                    + ", zip=" + zip + ", phoneNumber=" + phoneNumber + ", email=" + email + "]";
        }


    }
