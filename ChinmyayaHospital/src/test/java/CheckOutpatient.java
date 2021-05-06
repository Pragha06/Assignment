class CheckOutPatient {

    public static void main(String args[])
    {
        Patient p1=new Patient("Joe","Bangalore","05/02/2021",true);
        Patient p2=new Patient("Durai","Bangalore","05/03/2021",true);
        Patient p3=new Patient("Priya","Bangalore","05/03/2021",true);
        Patient p4=new Patient("Sowmia","Bangalore","05/04/2021",true);
        Patient p5=new Patient("Johnson","Mangalore","05/04/2021",true);
        Patient p6=new Patient("Janani","Coimbatore","05/04/2021",true);

        Hospital ChinmayaHospital= new Hospital();

        ChinmayaHospital.addPatient(p1);
        ChinmayaHospital.addPatient(p2);
        ChinmayaHospital.addPatient(p3);
        ChinmayaHospital.addPatient(p4);
        ChinmayaHospital.addPatient(p5);
        ChinmayaHospital.addPatient(p6);


        int localPatienPercentage = ChinmayaHospital.findOutPatientPercentage();
        System.out.println("Local out patient: "+localPatienPercentage);
        System.out.println("Outstation out patient: "+(100-localPatienPercentage));

    }
}

