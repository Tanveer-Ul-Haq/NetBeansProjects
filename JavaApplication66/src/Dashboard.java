
import java.awt.Color;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.UIManager;
import net.proteanit.sql.DbUtils;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author TANVEER UL HAQ
 */
public class Dashboard extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    Connection conn=null;
     
   //     public void initialize(URL url, ResourseBundle rb){
     //       jProgressBar1.setStyle("-fx-accent: blue;");
     //   }
        
    public Dashboard() {
        initComponents();
   //     UIManager.put("ProgressBar1.selectionBackground",Color.BLUE);
   
 //  ProgressBar loadingProgressBar = (ProgressBar) findViewById(R.id.prog);
 //  loadingProgressBar.getProgressDrawable().setColorFilter(
  //      Color.parseColor("#2a4c6b"), android.graphics.PorterDuff.Mode.SRC_IN);
  
         try{
            
            Class.forName("oracle.jdbc.driver.OracleDriver");
            conn = DriverManager.getConnection("jdbc:oracle:thin:@"+"DESKTOP-32DHV0C"+ ":" +"1521"+":", "system", "123");
            System.out.println("Connection established"); 
        }
        catch(Exception e)
        {
            System.out.println("Error occurs");
        }
         
         
          try{
            ResultSet rs=conn.createStatement().executeQuery("Select count(*) from rooms");
             while(rs.next())
             {
                 String count = rs.getString("count(*)");
                 jLabel3.setText(count);
             }
             ResultSet r=conn.createStatement().executeQuery("Select count(*) from rooms where booked='Yes'");
             while(r.next())
             {
                 String count = r.getString("count(*)");
                 jLabel5.setText(count);
             }
              ResultSet s=conn.createStatement().executeQuery("Select count(*) from rooms where booked='No'");
             while(s.next())
             {
                 String count = s.getString("count(*)");
                 jLabel18.setText(count);
             }
             ResultSet stu=conn.createStatement().executeQuery("Select count(*) from new_student");
             while(stu.next())
             {
                 String count = stu.getString("count(*)");
                 jLabel11.setText(count);
             }
             ResultSet st=conn.createStatement().executeQuery("Select count(*) from new_student where living='Yes'");
             while(st.next())
             {
                 String count = st.getString("count(*)");
                 jLabel22.setText(count);
             }
             ResultSet tu=conn.createStatement().executeQuery("Select count(*) from new_student where living='No'");
             while(tu.next())
             {
                 String count = tu.getString("count(*)");
                 jLabel15.setText(count);
             }
             ResultSet emp=conn.createStatement().executeQuery("Select count(*) from new_employee");
             while(emp.next())
             {
                 String count = emp.getString("count(*)");
                 jLabel17.setText(count);
             }
             ResultSet em=conn.createStatement().executeQuery("Select count(*) from new_employee where working='Yes'");
             while(em.next())
             {
                 String count = em.getString("count(*)");
                 jLabel23.setText(count);
             }
             ResultSet mp=conn.createStatement().executeQuery("Select count(*) from new_employee where working='No'");
             while(mp.next())
             {
                 String count = mp.getString("count(*)");
                 jLabel24.setText(count);
             }
             
             
             ResultSet rsa=conn.createStatement().executeQuery("Select count(*) from rooms");
             ResultSet rb=conn.createStatement().executeQuery("Select count(*) from rooms where booked='Yes'");
              while(rsa.next())
             {
                 String count1 = rsa.getString("count(*)");
                 int a = Integer.parseInt(count1);
                 while(rb.next())
                 {
                 String count2 = rb.getString("count(*)");
            //     System.out.println(count2);
                 int b = Integer.parseInt(count2);
            //     System.out.println(a+" and "+b);
                 int ro = (b*100)/a;
            //         System.out.println(ro);
                 
              //   jLabel7.setText(Integer.toString(ro)+"%");
               //      for (int i = 0; i < 10; i++) {
                         jProgressBar1.setValue(ro);
               //      }
            //     Thread.sleep(50);
                 }
                 
             }
             
             
             
             ResultSet studen=conn.createStatement().executeQuery("Select count(*) from new_student");
             ResultSet stud=conn.createStatement().executeQuery("Select count(*) from new_student where living='Yes'");
             while(studen.next())
             {
                 String count = studen.getString("count(*)");
                 int a = Integer.parseInt(count);
                 while(stud.next())
                 {
                 String count1 = stud.getString("count(*)");
                 int b = Integer.parseInt(count1);
                 int ro = (b*100)/a;
                 jProgressBar2.setValue(ro);
                 }
             }
            
             ResultSet empl=conn.createStatement().executeQuery("Select count(*) from new_employee");
             ResultSet epl=conn.createStatement().executeQuery("Select count(*) from new_employee where working='Yes'");
              while(empl.next())
             {
                 String count = empl.getString("count(*)");
                 int a = Integer.parseInt(count);
                 while(epl.next())
                 {
                 String count1 = epl.getString("count(*)");
                 int b = Integer.parseInt(count1);
                 int ro = (b*100)/a;
                 jProgressBar3.setValue(ro);
                 }
             }
            }
            catch(Exception e)
                    {
                    System.out.println("   Error");
                    }
          
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        manage_room = new javax.swing.JButton();
        New_student = new javax.swing.JButton();
        update_student = new javax.swing.JButton();
        student_fee = new javax.swing.JButton();
        living_student = new javax.swing.JButton();
        leaved_student = new javax.swing.JButton();
        new_employee = new javax.swing.JButton();
        update_employee = new javax.swing.JButton();
        employee_payment = new javax.swing.JButton();
        working_employee = new javax.swing.JButton();
        Leaved_employee = new javax.swing.JButton();
        log_out = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Dashboard = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jProgressBar1 = new javax.swing.JProgressBar();
        jProgressBar2 = new javax.swing.JProgressBar();
        jProgressBar3 = new javax.swing.JProgressBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(200, 25));
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Hostel Management System");

        manage_room.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        manage_room.setText("Manage rooms");
        manage_room.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        manage_room.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manage_roomActionPerformed(evt);
            }
        });

        New_student.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        New_student.setText("New Student");
        New_student.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        New_student.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                New_studentActionPerformed(evt);
            }
        });

        update_student.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        update_student.setText("Update and delete Student");
        update_student.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        update_student.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update_studentActionPerformed(evt);
            }
        });

        student_fee.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        student_fee.setText("Student Fee");
        student_fee.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        student_fee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                student_feeActionPerformed(evt);
            }
        });

        living_student.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        living_student.setText("Living Students");
        living_student.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        living_student.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                living_studentActionPerformed(evt);
            }
        });

        leaved_student.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        leaved_student.setText("Leaved Student");
        leaved_student.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        leaved_student.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                leaved_studentActionPerformed(evt);
            }
        });

        new_employee.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        new_employee.setText("New Employee");
        new_employee.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        new_employee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                new_employeeActionPerformed(evt);
            }
        });

        update_employee.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        update_employee.setText("Update and delete Employee");
        update_employee.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        update_employee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update_employeeActionPerformed(evt);
            }
        });

        employee_payment.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        employee_payment.setText("Employee Payment");
        employee_payment.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        employee_payment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                employee_paymentActionPerformed(evt);
            }
        });

        working_employee.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        working_employee.setText("Working Employees");
        working_employee.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        working_employee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                working_employeeActionPerformed(evt);
            }
        });

        Leaved_employee.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Leaved_employee.setText("Leaved Employee");
        Leaved_employee.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Leaved_employee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Leaved_employeeActionPerformed(evt);
            }
        });

        log_out.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        log_out.setText("Log Out");
        log_out.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        log_out.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                log_outActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Number of leaved Employees in Hostel:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("jLabel3");
        jLabel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        Dashboard.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Dashboard.setText("Dashboard");
        Dashboard.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Dashboard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DashboardActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Booked Rooms:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("jLabel5");
        jLabel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Total Number of Rooms in Hostel:");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setText("Number of leaved Students from Hostel:");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setText("jLabel3");
        jLabel11.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel14.setText("Empty / Remaining Rooms:");

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel15.setText("jLabel5");
        jLabel15.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel16.setText("Number of Living Students in Hostel:");

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel17.setText("jLabel5");
        jLabel17.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel18.setText("jLabel5");
        jLabel18.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel19.setText("Number of working Employees in Hostel:");

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel20.setText("Total Number of Students in Hostel:");

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel21.setText("Total Number of Employees in Hostel:");

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel22.setText("jLabel5");
        jLabel22.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel23.setText("jLabel5");
        jLabel23.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel24.setText("jLabel5");
        jLabel24.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jProgressBar1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jProgressBar1.setStringPainted(true);

        jProgressBar2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jProgressBar2.setStringPainted(true);

        jProgressBar3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jProgressBar3.setStringPainted(true);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Dashboard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(manage_room, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(New_student, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(update_student, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(student_fee, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(living_student, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(leaved_student, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(new_employee, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(update_employee, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(employee_payment, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(working_employee, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Leaved_employee, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(134, 134, 134)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel14)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel16)
                                            .addComponent(jLabel10)
                                            .addComponent(jLabel19)
                                            .addComponent(jLabel20)
                                            .addComponent(jLabel21))
                                        .addGap(22, 22, 22)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(160, 160, 160)
                                        .addComponent(log_out, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
                                            .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jProgressBar3, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(243, 243, 243))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(237, 237, 237)
                        .addComponent(jProgressBar2, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(log_out, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(Dashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(manage_room, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(New_student, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3))
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(update_student, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(student_fee, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel18))
                        .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11)))
                    .addComponent(living_student, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(leaved_student, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(new_employee, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel22))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(update_employee, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(employee_payment, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(working_employee, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Leaved_employee, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jProgressBar2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel23))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel24))
                        .addGap(18, 18, 18)
                        .addComponent(jProgressBar3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void log_outActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_log_outActionPerformed
        // TODO add your handling code here:
        Login Li = new Login();
        Li.show();
        this.hide();
    }//GEN-LAST:event_log_outActionPerformed

    private void manage_roomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manage_roomActionPerformed
        // TODO add your handling code here:
        new Manage_Room().setVisible(true);
          this.hide();
    }//GEN-LAST:event_manage_roomActionPerformed

    private void New_studentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_New_studentActionPerformed
        // TODO add your handling code here:
        new New_Students().setVisible(true);
        this.hide();
        
    }//GEN-LAST:event_New_studentActionPerformed

    private void update_studentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update_studentActionPerformed
        // TODO add your handling code here:
        new Update_and_delete_students().setVisible(true);
        this.hide();
    }//GEN-LAST:event_update_studentActionPerformed

    private void student_feeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_student_feeActionPerformed
        // TODO add your handling code here:
        new Student_fee().setVisible(true);
        this.hide();
    }//GEN-LAST:event_student_feeActionPerformed

    private void living_studentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_living_studentActionPerformed
        // TODO add your handling code here:
        new Living_Students().setVisible(true);
        this.hide();
    }//GEN-LAST:event_living_studentActionPerformed

    private void leaved_studentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_leaved_studentActionPerformed
        // TODO add your handling code here:
        new Leaved_Students().setVisible(true);
        this.hide();
    }//GEN-LAST:event_leaved_studentActionPerformed

    private void new_employeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_new_employeeActionPerformed
        // TODO add your handling code here:
        new New_Employee().setVisible(true);
        this.hide();
    }//GEN-LAST:event_new_employeeActionPerformed

    private void update_employeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update_employeeActionPerformed
        // TODO add your handling code here:
        new Update_and_delete_Employee().setVisible(true);
        this.hide();
    }//GEN-LAST:event_update_employeeActionPerformed

    private void employee_paymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_employee_paymentActionPerformed
        // TODO add your handling code here:
        new Employee_Payment().setVisible(true);
        this.hide();
    }//GEN-LAST:event_employee_paymentActionPerformed

    private void working_employeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_working_employeeActionPerformed
        // TODO add your handling code here:
        new Working_Employees().setVisible(true);
        this.hide();
    }//GEN-LAST:event_working_employeeActionPerformed

    private void Leaved_employeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Leaved_employeeActionPerformed
        // TODO add your handling code here:
        new Leaved_Employees().setVisible(true);
        this.hide();
    }//GEN-LAST:event_Leaved_employeeActionPerformed

    private void DashboardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DashboardActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DashboardActionPerformed

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
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
    /*
          Connection conn=null;
        try{
            
            Class.forName("oracle.jdbc.driver.OracleDriver");
            conn = DriverManager.getConnection("jdbc:oracle:thin:@"+"DESKTOP-BH3719K"+ ":" +"1521"+":", "system", "123");
            System.out.println("Connection established"); 
        }
        catch(Exception e)
        {
            System.out.println("Error occurs");
        }
        
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Dashboard;
    private javax.swing.JButton Leaved_employee;
    private javax.swing.JButton New_student;
    private javax.swing.JButton employee_payment;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    public static javax.swing.JProgressBar jProgressBar1;
    public static javax.swing.JProgressBar jProgressBar2;
    public static javax.swing.JProgressBar jProgressBar3;
    private javax.swing.JButton leaved_student;
    private javax.swing.JButton living_student;
    private javax.swing.JButton log_out;
    private javax.swing.JButton manage_room;
    private javax.swing.JButton new_employee;
    private javax.swing.JButton student_fee;
    private javax.swing.JButton update_employee;
    private javax.swing.JButton update_student;
    private javax.swing.JButton working_employee;
    // End of variables declaration//GEN-END:variables
}
