package org.example;

public class Contact {
        String firstName;
        String lastName;
        String email;
        String phone;
        Address address;

        public String getFirstName() {
                return firstName;
        }

        public void setFirstName(String firstName) {
                this.firstName = firstName;
        }

        public String getLastName() {
                return lastName;
        }

        public void setLastName(String lastName) {
                this.lastName = lastName;
        }

        public String getEmail() {
                return email;
        }

        public void setEmail(String email) {
                this.email = email;
        }

        public String getPhone() {
                return phone;
        }

        public void setPhone(String phone) {
                this.phone = phone;
        }

        public Address getAddress() {
                return address;
        }

        public void setAddress(Address address) {
                this.address = address;
        }

        public Contact(String firstName, String lastName, String email, String phone) {
                this.firstName = firstName;
                this.lastName = lastName;
                this.email = email;
                this.phone = phone;
        }
        public void print(){
                System.out.println(firstName + " " + lastName);
                System.out.println(email);
                System.out.println(phone);
                this.address.print();
        }
}
