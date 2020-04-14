package FINALPROJECT;

import java.io.*;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AddPage extends javax.swing.JFrame {
    
    private static int iCount = 0;
    private static int iYearsWorked = 0;
    private static int iAge = 0;
    private static int iIndex = 1;
    private static boolean bCheckInfo;
    private static String sTest;
    private static String[] data;
    private static String[] hire;
    private static String[] termination;
    private static PrintWriter out = null;
    private static String[][] EmployeeData = new String [10000][16];

    /**
     * Creates new form AddPage
     */
    public AddPage() {
        initComponents();
        MySettings();
    }

    public AddPage (String [][] sGetData){
        initComponents();
        MySettings();
        EmployeeData = sGetData;
    }
    
    public void MySettings()
    {
       jbAddAnother.setVisible(false); 
    }
    
    public boolean CheckSin()
    {
        boolean bCheck;
        int theSIN = Integer.parseInt(jfSIN.getText());

            boolean evenDigit = false; //alternates between true and false
            int sum = 0; //accumulates the sum of the digits (as modified)

            while (theSIN > 0) {
                int nextDigit = theSIN % 10; //grab the last digit
                theSIN = theSIN / 10; //discard that digit
                if(evenDigit) {
                    //double it, then add the two digits of the result
                    nextDigit = 2*nextDigit;
                    nextDigit = (nextDigit/10)+(nextDigit%10);
                    } // if(evenDigit)
                sum = sum + nextDigit;
                evenDigit = !evenDigit; //toggle the flag each time
            } // end while

            if (0 == sum % 10)
                bCheck = true;
            else
                bCheck = false;
            
            return bCheck;
    }
    
    public String normalizeZipCode(String incoming) 
    {
        return incoming.replaceAll("\\s+","");
    }
    
    public boolean CheckPostalCode()
    {
        boolean bCheck;
        String line = normalizeZipCode(jfPostalCode.getText());
	String pattern = "[A-Za-z][0-9][A-Za-z][0-9][A-Za-z][0-9]";

	// Create a Pattern object
	Pattern r = Pattern.compile(pattern);

	// Now create matcher object.
	Matcher m = r.matcher(line);
	if (m.find( )) {
	    bCheck = true;
	}else {
	    bCheck = false;
	}
        return bCheck;        
    }
    
    public boolean CheckPhoneNumbers(String sNumber)
    {
        boolean bCheck;
        String line = normalizeZipCode(sNumber);
	String pattern = "^(1\\-)?[0-9]{3}\\-?[0-9]{3}\\-?[0-9]{4}$" ;

	// Create a Pattern object
	Pattern r = Pattern.compile(pattern);

	// Now create matcher object.
	Matcher m = r.matcher(line);
	if (m.find( )) {
	    bCheck = true;
	}else {
	    bCheck = false;
	}
        return bCheck;        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jbMainMenu = new javax.swing.JButton();
        jlFirstName = new javax.swing.JLabel();
        jlLastName = new javax.swing.JLabel();
        jlStreetAddress = new javax.swing.JLabel();
        jlCity = new javax.swing.JLabel();
        jlProvince = new javax.swing.JLabel();
        jlPostalCode = new javax.swing.JLabel();
        jlSIN = new javax.swing.JLabel();
        jlHomePhone = new javax.swing.JLabel();
        jlCellPhone = new javax.swing.JLabel();
        jlDateOfBirth = new javax.swing.JLabel();
        jlHireDate = new javax.swing.JLabel();
        jlTerminationDate = new javax.swing.JLabel();
        jlDepartmentNumber = new javax.swing.JLabel();
        jlTitle = new javax.swing.JLabel();
        jfFirstName = new javax.swing.JTextField();
        jfLastName = new javax.swing.JTextField();
        jfStreetAddress = new javax.swing.JTextField();
        jfCity = new javax.swing.JTextField();
        jfPostalCode = new javax.swing.JTextField();
        jfSIN = new javax.swing.JTextField();
        jfHomePhone = new javax.swing.JTextField();
        jfCellPhone = new javax.swing.JTextField();
        jfDateOfBirth = new javax.swing.JTextField();
        jfHireDate = new javax.swing.JTextField();
        jfTerminationDate = new javax.swing.JTextField();
        jsDepartmentNumber = new javax.swing.JSpinner();
        jbSave = new javax.swing.JButton();
        jbAddAnother = new javax.swing.JButton();
        jcProvince = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jbMainMenu.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jbMainMenu.setText("Main Menu");
        jbMainMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbMainMenuActionPerformed(evt);
            }
        });

        jlFirstName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jlFirstName.setText("First Name: ");

        jlLastName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jlLastName.setText("Last Name: ");

        jlStreetAddress.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jlStreetAddress.setText("Street Address: ");

        jlCity.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jlCity.setText("City: ");

        jlProvince.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jlProvince.setText("Province: ");

        jlPostalCode.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jlPostalCode.setText("Postal Code: ");

        jlSIN.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jlSIN.setText("Social Insurance Number: ");

        jlHomePhone.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jlHomePhone.setText("Home Phone Number: ");

        jlCellPhone.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jlCellPhone.setText("Cell Phone Number: ");

        jlDateOfBirth.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jlDateOfBirth.setText("Date Of Birth (dd-mm-yyyy): ");

        jlHireDate.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jlHireDate.setText("Hire Date (dd-mm-yyyy): ");

        jlTerminationDate.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jlTerminationDate.setText("Termination Date (dd-mm-yyyy): ");

        jlDepartmentNumber.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jlDepartmentNumber.setText("Department Number: ");

        jlTitle.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jlTitle.setText("Please Fill Out All The Fields");

        jfFirstName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jfLastName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jfStreetAddress.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jfCity.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jfPostalCode.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jfSIN.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jfHomePhone.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jfCellPhone.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jfDateOfBirth.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jfHireDate.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jfTerminationDate.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jsDepartmentNumber.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jsDepartmentNumber.setModel(new javax.swing.SpinnerNumberModel(1, 1, 20, 1));

        jbSave.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jbSave.setText("Save");
        jbSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSaveActionPerformed(evt);
            }
        });

        jbAddAnother.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jbAddAnother.setText("Add Another");
        jbAddAnother.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAddAnotherActionPerformed(evt);
            }
        });

        jcProvince.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jcProvince.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Alberta", "British Columbia", "Manitoba", "New Brunswick", "Newfoundland and Labrador", "Northwest Territories", "Nova Scotia", "Nunavut", "Ontario", "Prince Edward Island", "Quebec", "Saskatchewan", "Yukon" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jbMainMenu)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jlTitle))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jbSave)
                                    .addComponent(jlDepartmentNumber))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jfFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jfLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jfStreetAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jfCity, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jfPostalCode, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jfSIN, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jfHomePhone, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jfCellPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jfDateOfBirth, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jfHireDate, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jfTerminationDate, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jsDepartmentNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jbAddAnother)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jlCity)
                                            .addComponent(jlStreetAddress)
                                            .addComponent(jlProvince)
                                            .addComponent(jlPostalCode)
                                            .addComponent(jlSIN)
                                            .addComponent(jlHomePhone)
                                            .addComponent(jlCellPhone)
                                            .addComponent(jlDateOfBirth)
                                            .addComponent(jlHireDate)
                                            .addComponent(jlTerminationDate))
                                        .addGap(1, 1, 1))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jlLastName)
                                        .addComponent(jlFirstName)))
                                .addComponent(jcProvince, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(217, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbMainMenu)
                    .addComponent(jlTitle))
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlFirstName)
                    .addComponent(jfFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jfLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlLastName))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jfStreetAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlStreetAddress))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jfCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlCity))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlProvince)
                    .addComponent(jcProvince, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jfPostalCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlPostalCode))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jfSIN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlSIN))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jfHomePhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlHomePhone))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jfCellPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlCellPhone))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jfDateOfBirth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlDateOfBirth))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jfHireDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlHireDate))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jfTerminationDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlTerminationDate))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlDepartmentNumber)
                    .addComponent(jsDepartmentNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbSave)
                    .addComponent(jbAddAnother))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static int Calculate (String sValue)
    {
        int iNumber = 0;
        if (sValue.length() == 0)
            JOptionPane.showMessageDialog(null,"There was a problem with one of the dates. Please enter again.");
        else
        {
        int iYear = 0, iMonth = 0, iDay = 0;
	String sYear = "", sMonth = "", sDay = "";
        data = sValue.split("-");
	sYear = data[2];
	iYear = Integer.parseInt (sYear);      

	sMonth = data[1];
	iMonth = Integer.parseInt (sMonth);
            
	sDay = data[0];
	iDay = Integer.parseInt (sDay);
					
	int iYear2 = iYear % 100;
            
	Calendar now = Calendar.getInstance();
	Calendar dob = Calendar.getInstance();
	Date date = new Date(iYear2, iMonth, iDay);
	dob.setTime(date);
	if (iYear >= now.get(Calendar.YEAR)) 
	{
            if (iMonth >= now.get(Calendar.MONTH))
            {
		if (iDay > now.get(Calendar.DAY_OF_MONTH))
		{
                    JOptionPane.showMessageDialog(null,"There was a problem with one of the dates. Please enter again.");
		}
                else if (iDay == now.get(Calendar.DAY_OF_MONTH))
                {
                    JOptionPane.showMessageDialog(null,"There was a problem with one of the dates. Please enter again.");
                }
                else
                {
                    JOptionPane.showMessageDialog(null,"There was a problem with one of the dates. Please enter again");
                }
            }
            else
            {
		JOptionPane.showMessageDialog(null,"There was a problem with one of the dates. Please enter again.");
            }
	}
	else
        {
            int year1 = now.get(Calendar.YEAR);
            int year2 = dob.get(Calendar.YEAR);
            iNumber = year1 - year2;
            int month1 = now.get(Calendar.MONTH);
            int month2 = dob.get(Calendar.MONTH);
            if (month2 > month1) 
            {
		iNumber--;
            } 
            else if (month1 == month2) 
            {
		int day1 = now.get(Calendar.DAY_OF_MONTH);
		int day2 = dob.get(Calendar.DAY_OF_MONTH);
		if (day2 > day1) 
                {
                    iNumber--;
		}
            }
            if (iYear>=2000)
            {
		iNumber -= 100;
            }  
	}
         
        }
        return iNumber;
    }
    
    private void jbSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSaveActionPerformed
        // TODO add your handling code here:
        iCount ++;
        
        //Calculate Age
        iAge = Calculate(jfDateOfBirth.getText());
        
        //Calculate Years Worked
        if (jfHireDate.getText().length() != 0 && jfTerminationDate.getText().length() != 0)
        {
            //Hire Date
            int iHireYear = 0, iHireMonth = 0, iHireDay = 0;
            String sHireYear = "", sHireMonth = "", sHireDay = "";
            hire = jfHireDate.getText().split("-");
            sHireYear = hire[2];
            iHireYear = Integer.parseInt (sHireYear);      

            sHireMonth = hire[1];
            iHireMonth = Integer.parseInt (sHireMonth);
            
            sHireDay = hire[0];
            iHireDay = Integer.parseInt (sHireDay);
					
            int iHireYear2 = iHireYear % 100;
            
            //Termination date
            int iTermYear = 0, iTermMonth = 0, iTermDay = 0;
            String sTermYear = "", sTermMonth = "", sTermDay = "";
            termination = jfTerminationDate.getText().split("-");
            sTermYear = termination[2];
            iTermYear = Integer.parseInt (sTermYear);      

            sTermMonth = termination[1];
            iTermMonth = Integer.parseInt (sTermMonth);
            
            sTermDay = termination[0];
            iTermDay = Integer.parseInt (sTermDay);
					
            int iTermYear2 = iTermYear % 100;
            
            //Calcualtions
            Calendar terminationdate = Calendar.getInstance();
            Calendar hiredate = Calendar.getInstance();
            Date dateofhire = new Date(iHireYear2, iHireMonth, iHireDay);
            Date dateoftermination = new Date(iTermYear2, iTermMonth, iTermDay);
            hiredate.setTime(dateofhire);
            terminationdate.setTime(dateoftermination);
            if (iHireYear >= iTermYear) 
            {
                if (iHireMonth >= iTermMonth)
                {
                    if (iHireDay > iTermDay)
                    {
                        JOptionPane.showMessageDialog(null,"Employee can't be fired before being hired.");
                    }
                    else if (iHireDay == iTermDay)
                    {
                        JOptionPane.showMessageDialog(null,"Employee can't be hired and fired on the same day.");
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null,"Employee can't be fired before being hired.");
                    }
                }
                else
                {
                    JOptionPane.showMessageDialog(null,"Employee can't be fired before being hired.");
                }
            }   
            else
            {
                int year1 = iTermYear;
                int year2 = iHireYear;
                iYearsWorked = year1 - year2;
                int month1 = iTermMonth;
                int month2 = iHireMonth;
                if (month2 > month1) 
                {
                    iYearsWorked--;
                } 
                else if (month1 == month2) 
                {
                    int day1 = iTermDay;
                    int day2 = iHireDay;
                    if (day2 > day1) 
                    {
                        iYearsWorked--;
                    }
                }
                
                if (iYearsWorked<0)
                    iYearsWorked *= -1;
            }
        }
        if (jfTerminationDate.getText().length() == 0)
            iYearsWorked = Calculate(jfHireDate.getText());
        
        //See if information is missing
        if (jfCellPhone.getText().length() == 0 || jfCity.getText().length() == 0 || jfDateOfBirth.getText().length() == 0 || jfFirstName.getText().length() == 0 || jfHireDate.getText().length() == 0 || jfHomePhone.getText().length() == 0 || jfLastName.getText().length() == 0 || jfPostalCode.getText().length() == 0 || jfSIN.getText().length() == 0 || jfStreetAddress.getText().length() == 0 )
        {
            JOptionPane.showMessageDialog(null,"Missing Information. Please Make Sure All Entries Have Been Filled");
        }
        
        //Check SIN number
        if ((bCheckInfo=CheckSin()) == false)
            JOptionPane.showMessageDialog(null,"Invalid SIN number. Please enter again");
        
        //Check Postal Code
        if ((bCheckInfo=CheckPostalCode()) == false)
            JOptionPane.showMessageDialog(null,"Invalid Postal Code. Please enter again");
        
        //Check Home Phone
        if ((bCheckInfo=CheckPhoneNumbers(jfHomePhone.getText())) == false)
            JOptionPane.showMessageDialog(null,"Invalid Home Phone Number. Please enter again");
        
        //Check Cell Phone
        if ((bCheckInfo=CheckPhoneNumbers(jfCellPhone.getText())) == false)
            JOptionPane.showMessageDialog(null,"Invalid Cell Phone Number. Please enter again");
        
        //If all information has been met, print into file
        else
        {            
            File file = new File("D:\\School\\High School\\Grade 12\\Employee\\Mock-Employee-Database\\FINAL PROJECT\\src\\FINALPROJECT\\EmployeeData.txt");
            try 
            {
                    out = new PrintWriter(
                    new BufferedWriter(
                    new FileWriter(file)), true);
            }
            catch (IOException e)
            {
		JOptionPane.showMessageDialog(null,"The file cannot be created!  Error Number - " + e);
            }
            
            if (iCount == 1)
            {
                for (int i = 1; i < 10000; i++)
                {
                    sTest = EmployeeData[i][1];
                    if (sTest == null)
                        break;
                    else
                        iIndex++;
                }
            }
            EmployeeData [iIndex][1] = jfFirstName.getText();
            EmployeeData [iIndex][2] = jfLastName.getText();
            EmployeeData [iIndex][3] = jfDateOfBirth.getText();
            EmployeeData [iIndex][4] = Integer.toString(iAge);
            EmployeeData [iIndex][5] = jfStreetAddress.getText();
            EmployeeData [iIndex][6] = jfCity.getText();
            EmployeeData [iIndex][7] = (String) jcProvince.getSelectedItem();
            EmployeeData [iIndex][8] = jfPostalCode.getText();
            EmployeeData [iIndex][9] = jfSIN.getText();
            EmployeeData [iIndex][10] = jfHomePhone.getText();
            EmployeeData [iIndex][11] = jfCellPhone.getText();
            EmployeeData [iIndex][12] = Integer.toString((int) jsDepartmentNumber.getValue());
            EmployeeData [iIndex][13] = jfHireDate.getText();
            EmployeeData [iIndex][14] = jfTerminationDate.getText();
            EmployeeData [iIndex][15] = Integer.toString(iYearsWorked);
            iIndex++;
   
            for (int i = 1; i <= 10000; i++)
            {
                if (EmployeeData[i][1] == null)
                    break;
                else
                {
                    out.print(EmployeeData[i][1]);
                    for (int j = 2; j <= 15; j++)
                    {
                        out.print(","+EmployeeData[i][j]);
                    }
                    out.println();
                }
            }
            
            jbAddAnother.setVisible(true);
            jbSave.setVisible(false);
        }
        
        
    }//GEN-LAST:event_jbSaveActionPerformed

    private void jbMainMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbMainMenuActionPerformed
        // TODO add your handling code here:
        if (jfCellPhone.getText().length() == 0 && jfCity.getText().length() == 0 && jfDateOfBirth.getText().length() == 0 && jfFirstName.getText().length() == 0 && jfHireDate.getText().length() == 0 && jfHomePhone.getText().length() == 0 && jfLastName.getText().length() == 0 && jfPostalCode.getText().length() == 0 && jfSIN.getText().length() == 0 && jfStreetAddress.getText().length() == 0 && jfTerminationDate.getText().length() == 0 )
        {        
            new StartScreen().setVisible(true);
            this.dispose();
        }
        
        else if (iCount < 1)
        {
            JOptionPane.showMessageDialog(null,"Please Save Before Exiting.");
        }
        
        else
        {
            new StartScreen().setVisible(true);
            this.dispose();
        }
        
    }//GEN-LAST:event_jbMainMenuActionPerformed

    private void jbAddAnotherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAddAnotherActionPerformed
        // TODO add your handling code here:
        //this.dispose();
        //new AddPage().setVisible(true);
        jbAddAnother.setVisible(false);
        jbSave.setVisible(true);
        iCount = 0;
        
        jfFirstName.setText("");
        jfLastName.setText("");
        jfDateOfBirth.setText("");
        jfStreetAddress.setText("");
        jfCity.setText("");
        jcProvince.setSelectedItem(1);
        jfPostalCode.setText("");
        jfSIN.setText("");
        jfHomePhone.setText("");
        jfCellPhone.setText("");
        jsDepartmentNumber.setValue(1);
        jfHireDate.setText("");
        jfTerminationDate.setText("");
    }//GEN-LAST:event_jbAddAnotherActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AddPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbAddAnother;
    private javax.swing.JButton jbMainMenu;
    private javax.swing.JButton jbSave;
    private javax.swing.JComboBox<String> jcProvince;
    private javax.swing.JTextField jfCellPhone;
    private javax.swing.JTextField jfCity;
    private javax.swing.JTextField jfDateOfBirth;
    private javax.swing.JTextField jfFirstName;
    private javax.swing.JTextField jfHireDate;
    private javax.swing.JTextField jfHomePhone;
    private javax.swing.JTextField jfLastName;
    private javax.swing.JTextField jfPostalCode;
    private javax.swing.JTextField jfSIN;
    private javax.swing.JTextField jfStreetAddress;
    private javax.swing.JTextField jfTerminationDate;
    private javax.swing.JLabel jlCellPhone;
    private javax.swing.JLabel jlCity;
    private javax.swing.JLabel jlDateOfBirth;
    private javax.swing.JLabel jlDepartmentNumber;
    private javax.swing.JLabel jlFirstName;
    private javax.swing.JLabel jlHireDate;
    private javax.swing.JLabel jlHomePhone;
    private javax.swing.JLabel jlLastName;
    private javax.swing.JLabel jlPostalCode;
    private javax.swing.JLabel jlProvince;
    private javax.swing.JLabel jlSIN;
    private javax.swing.JLabel jlStreetAddress;
    private javax.swing.JLabel jlTerminationDate;
    private javax.swing.JLabel jlTitle;
    private javax.swing.JSpinner jsDepartmentNumber;
    // End of variables declaration//GEN-END:variables
}