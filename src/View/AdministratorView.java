
package View;
import java.awt.CardLayout;
import java.sql.SQLException;
import Controller.ProcessController;
import Controller.DbManager;
import Controller.TaskController;
import Model.ProcessModel;
import Model.TaskModel;
import static java.lang.Integer.parseInt;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class AdministratorView extends javax.swing.JFrame {
    
    private TaskController tc;
    private ProcessController pc;
    private DbManager dbm;
    
    public AdministratorView() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        mainPanel = new javax.swing.JPanel();
        login = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        id_field = new javax.swing.JFormattedTextField();
        password_field = new javax.swing.JPasswordField();
        login_jb = new javax.swing.JButton();
        mainMenu = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        createProcess_jb = new javax.swing.JButton();
        viewProcess_jb = new javax.swing.JButton();
        signOut_jb = new javax.swing.JButton();
        createProcess = new javax.swing.JPanel();
        mainMenu1_jb = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        preprintID_field = new javax.swing.JFormattedTextField();
        category_field = new javax.swing.JFormattedTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        comments_pane = new javax.swing.JTextPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        specTasks_table = new javax.swing.JTable();
        addProcess_jb = new javax.swing.JButton();
        viewProcess = new javax.swing.JPanel();
        mainMenu2_jb = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tasks_table = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        processes_table = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        uppdateProcess_jb = new javax.swing.JButton();
        selectProcess_jb = new javax.swing.JButton();
        uppdateTask_jb = new javax.swing.JButton();
        deleteProcess_jb = new javax.swing.JButton();
        deleteTask_jb = new javax.swing.JButton();
        uppdateProcess = new javax.swing.JPanel();
        mainMenu3_jb = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        updatePr_jb = new javax.swing.JButton();
        processNum_field = new javax.swing.JTextField();
        up_status_field = new javax.swing.JTextField();
        up_projectedDuration_field = new javax.swing.JTextField();
        up_processCategory_field = new javax.swing.JTextField();
        up_startDate_field = new javax.swing.JTextField();
        up_pLeadID_field = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        up_comments_pane = new javax.swing.JTextPane();
        uppdateTask = new javax.swing.JPanel();
        mainMenu4_jb = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        up_ta_taskID_field = new javax.swing.JTextField();
        updateTa_jb = new javax.swing.JButton();
        up_ta_suppID_field = new javax.swing.JTextField();
        up_ta_processID_field = new javax.swing.JTextField();
        up_ta_taskName_field = new javax.swing.JTextField();
        up_ta_startDate_field = new javax.swing.JTextField();
        up_ta_budgetedTime_field = new javax.swing.JTextField();
        up_ta_endDate_field = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        up_ta_duration_field = new javax.swing.JTextField();
        up_ta_costPerHour_field = new javax.swing.JTextField();
        up_ta_status_field = new javax.swing.JTextField();
        up_ta_competenceID_field = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();

        jButton3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jButton3.setText("View Processes");

        jButton1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jButton1.setText("Create new process");

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 48)); // NOI18N
        jLabel2.setText("AHS - Fiktiva AB");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mainPanel.setLayout(new java.awt.CardLayout());

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 48)); // NOI18N
        jLabel4.setText("ÄHS - Fiktiva AB");

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel1.setText("Enter id:");

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel5.setText("Enter password:");

        id_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                id_fieldActionPerformed(evt);
            }
        });

        password_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                password_fieldActionPerformed(evt);
            }
        });

        login_jb.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        login_jb.setText("Login");
        login_jb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                login_jbActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout loginLayout = new javax.swing.GroupLayout(login);
        login.setLayout(loginLayout);
        loginLayout.setHorizontalGroup(
            loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginLayout.createSequentialGroup()
                .addContainerGap(128, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(130, 130, 130))
            .addGroup(loginLayout.createSequentialGroup()
                .addGap(160, 160, 160)
                .addGroup(loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(login_jb)
                    .addGroup(loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel5)
                        .addComponent(jLabel1)
                        .addComponent(id_field)
                        .addComponent(password_field, javax.swing.GroupLayout.DEFAULT_SIZE, 296, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        loginLayout.setVerticalGroup(
            loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginLayout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(jLabel4)
                .addGap(86, 86, 86)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(id_field, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(password_field, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(login_jb)
                .addContainerGap(161, Short.MAX_VALUE))
        );

        mainPanel.add(login, "login");

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 48)); // NOI18N
        jLabel3.setText("ÄHS - Fiktiva AB");

        createProcess_jb.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        createProcess_jb.setText("Create new Process");
        createProcess_jb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createProcess_jbActionPerformed(evt);
            }
        });

        viewProcess_jb.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        viewProcess_jb.setText("View my Processes");
        viewProcess_jb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewProcess_jbActionPerformed(evt);
            }
        });

        signOut_jb.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        signOut_jb.setText("Sign Out");
        signOut_jb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signOut_jbActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout mainMenuLayout = new javax.swing.GroupLayout(mainMenu);
        mainMenu.setLayout(mainMenuLayout);
        mainMenuLayout.setHorizontalGroup(
            mainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainMenuLayout.createSequentialGroup()
                .addGroup(mainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainMenuLayout.createSequentialGroup()
                        .addGroup(mainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(mainMenuLayout.createSequentialGroup()
                                .addGap(130, 130, 130)
                                .addComponent(jLabel3))
                            .addGroup(mainMenuLayout.createSequentialGroup()
                                .addGap(181, 181, 181)
                                .addGroup(mainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(viewProcess_jb, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(createProcess_jb))))
                        .addGap(0, 117, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainMenuLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(signOut_jb)))
                .addContainerGap())
        );
        mainMenuLayout.setVerticalGroup(
            mainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainMenuLayout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(jLabel3)
                .addGap(103, 103, 103)
                .addComponent(createProcess_jb)
                .addGap(68, 68, 68)
                .addComponent(viewProcess_jb)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 169, Short.MAX_VALUE)
                .addComponent(signOut_jb)
                .addContainerGap())
        );

        mainPanel.add(mainMenu, "mainMenu");

        mainMenu1_jb.setText("Back to main menu");
        mainMenu1_jb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mainMenu1_jbActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel6.setText("Process ID:");

        jLabel7.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel7.setText("Enter category:");

        jLabel8.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel8.setText("Specify tasks:");

        jLabel9.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel9.setText("Additional comments:");

        preprintID_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                preprintID_fieldActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(comments_pane);

        specTasks_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Name", "Budgeted time", "CompetenceID"
            }
        ));
        jScrollPane3.setViewportView(specTasks_table);

        addProcess_jb.setText("Add process");
        addProcess_jb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addProcess_jbActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout createProcessLayout = new javax.swing.GroupLayout(createProcess);
        createProcess.setLayout(createProcessLayout);
        createProcessLayout.setHorizontalGroup(
            createProcessLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(createProcessLayout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addGroup(createProcessLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addGroup(createProcessLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 453, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(addProcess_jb)
                        .addComponent(mainMenu1_jb))
                    .addComponent(jLabel8)
                    .addComponent(category_field, javax.swing.GroupLayout.PREFERRED_SIZE, 453, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(preprintID_field, javax.swing.GroupLayout.PREFERRED_SIZE, 453, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addContainerGap(88, Short.MAX_VALUE))
        );
        createProcessLayout.setVerticalGroup(
            createProcessLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, createProcessLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(preprintID_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(category_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addProcess_jb)
                .addGap(11, 11, 11)
                .addComponent(mainMenu1_jb)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        mainPanel.add(createProcess, "createProcess");

        mainMenu2_jb.setText("Back to main menu");
        mainMenu2_jb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mainMenu2_jbActionPerformed(evt);
            }
        });

        tasks_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Task ID", "Name", "Responsibility", "Cost/h", "Elapsed time", "Status"
            }
        ));
        jScrollPane2.setViewportView(tasks_table);

        processes_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Process ID", "Budgeted time", "Elapsed time", "Status"
            }
        ));
        jScrollPane4.setViewportView(processes_table);

        jLabel10.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel10.setText("Processes:");

        jLabel11.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel11.setText("Corresponding tasks:");

        uppdateProcess_jb.setText("Update selected process");
        uppdateProcess_jb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uppdateProcess_jbActionPerformed(evt);
            }
        });

        selectProcess_jb.setText("Select process");
        selectProcess_jb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectProcess_jbActionPerformed(evt);
            }
        });

        uppdateTask_jb.setText("Update selected task");
        uppdateTask_jb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uppdateTask_jbActionPerformed(evt);
            }
        });

        deleteProcess_jb.setText("Delete process");
        deleteProcess_jb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteProcess_jbActionPerformed(evt);
            }
        });

        deleteTask_jb.setText("Delete task");
        deleteTask_jb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteTask_jbActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout viewProcessLayout = new javax.swing.GroupLayout(viewProcess);
        viewProcess.setLayout(viewProcessLayout);
        viewProcessLayout.setHorizontalGroup(
            viewProcessLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(viewProcessLayout.createSequentialGroup()
                .addGroup(viewProcessLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, viewProcessLayout.createSequentialGroup()
                        .addContainerGap(479, Short.MAX_VALUE)
                        .addComponent(mainMenu2_jb))
                    .addGroup(viewProcessLayout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addGroup(viewProcessLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(viewProcessLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel10)
                                .addComponent(jLabel11))
                            .addGroup(viewProcessLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(deleteProcess_jb, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(uppdateProcess_jb, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(selectProcess_jb, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(viewProcessLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(deleteTask_jb, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(uppdateTask_jb, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(0, 83, Short.MAX_VALUE)))
                .addContainerGap())
        );
        viewProcessLayout.setVerticalGroup(
            viewProcessLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, viewProcessLayout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(selectProcess_jb)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(uppdateProcess_jb)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(deleteProcess_jb)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(uppdateTask_jb)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(deleteTask_jb)
                .addGap(64, 64, 64)
                .addComponent(mainMenu2_jb)
                .addContainerGap())
        );

        mainPanel.add(viewProcess, "viewProcess");

        mainMenu3_jb.setText("Back");
        mainMenu3_jb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mainMenu3_jbActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel12.setText("Process ID:");

        updatePr_jb.setText("Update");
        updatePr_jb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatePr_jbActionPerformed(evt);
            }
        });

        processNum_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                processNum_fieldActionPerformed(evt);
            }
        });

        up_status_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                up_status_fieldActionPerformed(evt);
            }
        });

        up_projectedDuration_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                up_projectedDuration_fieldActionPerformed(evt);
            }
        });

        up_processCategory_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                up_processCategory_fieldActionPerformed(evt);
            }
        });

        up_startDate_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                up_startDate_fieldActionPerformed(evt);
            }
        });

        up_pLeadID_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                up_pLeadID_fieldActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel15.setText("Process Leader ID:");

        jLabel16.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel16.setText("Start Date:");

        jLabel17.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel17.setText("Process Category:");

        jLabel18.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel18.setText("Status:");

        jLabel19.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel19.setText("Projected Duration:");

        jLabel20.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel20.setText("Comments:");

        jScrollPane5.setViewportView(up_comments_pane);

        javax.swing.GroupLayout uppdateProcessLayout = new javax.swing.GroupLayout(uppdateProcess);
        uppdateProcess.setLayout(uppdateProcessLayout);
        uppdateProcessLayout.setHorizontalGroup(
            uppdateProcessLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(uppdateProcessLayout.createSequentialGroup()
                .addGap(119, 119, 119)
                .addGroup(uppdateProcessLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(updatePr_jb)
                    .addGroup(uppdateProcessLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(uppdateProcessLayout.createSequentialGroup()
                            .addComponent(jLabel20)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jScrollPane5))
                        .addGroup(uppdateProcessLayout.createSequentialGroup()
                            .addGroup(uppdateProcessLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel15)
                                .addComponent(jLabel12)
                                .addComponent(jLabel16)
                                .addComponent(jLabel17)
                                .addComponent(jLabel19)
                                .addComponent(jLabel18))
                            .addGap(42, 42, 42)
                            .addGroup(uppdateProcessLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(processNum_field, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                                .addComponent(up_pLeadID_field)
                                .addComponent(up_startDate_field)
                                .addComponent(up_processCategory_field)
                                .addComponent(up_projectedDuration_field)
                                .addComponent(up_status_field)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                .addComponent(mainMenu3_jb)
                .addContainerGap())
        );
        uppdateProcessLayout.setVerticalGroup(
            uppdateProcessLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, uppdateProcessLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(uppdateProcessLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(processNum_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addGap(31, 31, 31)
                .addGroup(uppdateProcessLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(up_pLeadID_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(uppdateProcessLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(up_startDate_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addGroup(uppdateProcessLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(up_processCategory_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(uppdateProcessLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(up_projectedDuration_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(uppdateProcessLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(up_status_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57)
                .addGroup(uppdateProcessLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
                    .addGroup(uppdateProcessLayout.createSequentialGroup()
                        .addComponent(jLabel20)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(uppdateProcessLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mainMenu3_jb)
                    .addComponent(updatePr_jb))
                .addContainerGap())
        );

        mainPanel.add(uppdateProcess, "uppdateProcess");

        mainMenu4_jb.setText("Back");
        mainMenu4_jb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mainMenu4_jbActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel13.setText("Task ID:");

        up_ta_taskID_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                up_ta_taskID_fieldActionPerformed(evt);
            }
        });

        updateTa_jb.setText("Update");
        updateTa_jb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateTa_jbActionPerformed(evt);
            }
        });

        up_ta_suppID_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                up_ta_suppID_fieldActionPerformed(evt);
            }
        });

        up_ta_processID_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                up_ta_processID_fieldActionPerformed(evt);
            }
        });

        up_ta_taskName_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                up_ta_taskName_fieldActionPerformed(evt);
            }
        });

        up_ta_startDate_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                up_ta_startDate_fieldActionPerformed(evt);
            }
        });

        up_ta_budgetedTime_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                up_ta_budgetedTime_fieldActionPerformed(evt);
            }
        });

        up_ta_endDate_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                up_ta_endDate_fieldActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel14.setText("Support Employee ID:");

        jLabel21.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel21.setText("Task Name:");

        jLabel22.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel22.setText("Process ID:");

        jLabel23.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel23.setText("End Date:");

        jLabel24.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel24.setText("Start Date:");

        jLabel25.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel25.setText("Status:");

        jLabel26.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel26.setText("Budgeted Time:");

        jLabel27.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel27.setText("Duration:");

        jLabel28.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel28.setText("Cost Per Hour:");

        up_ta_duration_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                up_ta_duration_fieldActionPerformed(evt);
            }
        });

        up_ta_costPerHour_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                up_ta_costPerHour_fieldActionPerformed(evt);
            }
        });

        up_ta_status_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                up_ta_status_fieldActionPerformed(evt);
            }
        });

        up_ta_competenceID_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                up_ta_competenceID_fieldActionPerformed(evt);
            }
        });

        jLabel29.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel29.setText("Competence ID:");

        jLabel30.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel30.setText("Comments:");

        jScrollPane6.setViewportView(jTextPane1);

        javax.swing.GroupLayout uppdateTaskLayout = new javax.swing.GroupLayout(uppdateTask);
        uppdateTask.setLayout(uppdateTaskLayout);
        uppdateTaskLayout.setHorizontalGroup(
            uppdateTaskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(uppdateTaskLayout.createSequentialGroup()
                .addGroup(uppdateTaskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(uppdateTaskLayout.createSequentialGroup()
                        .addGap(143, 143, 143)
                        .addGroup(uppdateTaskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(uppdateTaskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel29)
                                .addComponent(jLabel22)
                                .addComponent(jLabel21)
                                .addComponent(jLabel24)
                                .addComponent(jLabel23)
                                .addComponent(jLabel26)
                                .addComponent(jLabel27)
                                .addComponent(jLabel28)
                                .addComponent(jLabel25)
                                .addGroup(uppdateTaskLayout.createSequentialGroup()
                                    .addComponent(jLabel30)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel13)
                                .addGroup(uppdateTaskLayout.createSequentialGroup()
                                    .addComponent(jLabel14)
                                    .addGap(31, 31, 31)
                                    .addGroup(uppdateTaskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(up_ta_taskID_field, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                                        .addComponent(up_ta_processID_field)
                                        .addComponent(up_ta_suppID_field)
                                        .addComponent(up_ta_competenceID_field)
                                        .addComponent(up_ta_taskName_field)
                                        .addComponent(up_ta_startDate_field)
                                        .addComponent(up_ta_endDate_field)
                                        .addComponent(up_ta_budgetedTime_field)
                                        .addComponent(up_ta_duration_field)
                                        .addComponent(up_ta_costPerHour_field)
                                        .addComponent(up_ta_status_field))))
                            .addComponent(updateTa_jb))
                        .addGap(0, 95, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, uppdateTaskLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(mainMenu4_jb)))
                .addContainerGap())
        );
        uppdateTaskLayout.setVerticalGroup(
            uppdateTaskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, uppdateTaskLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(uppdateTaskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(up_ta_taskID_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(uppdateTaskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(up_ta_processID_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(uppdateTaskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(up_ta_suppID_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(uppdateTaskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29)
                    .addComponent(up_ta_competenceID_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(uppdateTaskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(up_ta_taskName_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(uppdateTaskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(up_ta_startDate_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(uppdateTaskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(up_ta_endDate_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(uppdateTaskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(up_ta_budgetedTime_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(uppdateTaskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27)
                    .addComponent(up_ta_duration_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(uppdateTaskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28)
                    .addComponent(up_ta_costPerHour_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(uppdateTaskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(up_ta_status_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(uppdateTaskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel30)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(updateTa_jb)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mainMenu4_jb)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        mainPanel.add(uppdateTask, "uppdateTask");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void initProcessController(){
        try{
            pc = new ProcessController();
        } catch (SQLException ex){
            System.out.println("Fel i initieringen av ProcessController: " + ex.getMessage());
        }
    }
    
    public void initTaskController(){
        try{
            tc = new TaskController();
        } catch (SQLException ex){
            System.out.println("Fel i initieringen av TaskController: " + ex.getMessage());
        }
    }
    
    public void initDbManager(){
        try{
            dbm = new DbManager();
        } catch (SQLException ex){
            System.out.println("Fel i initieringen av DbManager: " + ex.getMessage());
        }
    }
    
    private void createProcess_jbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createProcess_jbActionPerformed
        initDbManager();
        //Gör så att cardet createProcess visas när knappen trycks
        CardLayout card = (CardLayout) mainPanel.getLayout();
        card.show(mainPanel, "createProcess");
        //På kommande createProcess-sidan skrivs korrekt process-id ut genom nedanstående kod
        try {
            int processID = dbm.getMaxProcessID();
            preprintID_field.setText(Integer.toString(processID + 1));
        } catch (SQLException ex) {
            System.out.println("Fel i hämtningen av maxProcessID: " + ex.getMessage());
        }
    }//GEN-LAST:event_createProcess_jbActionPerformed

    private void mainMenu1_jbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mainMenu1_jbActionPerformed
        CardLayout card = (CardLayout) mainPanel.getLayout();
        card.show(mainPanel, "mainMenu");
    }//GEN-LAST:event_mainMenu1_jbActionPerformed

    private void mainMenu2_jbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mainMenu2_jbActionPerformed
        CardLayout card = (CardLayout) mainPanel.getLayout();
        card.show(mainPanel, "mainMenu");
    }//GEN-LAST:event_mainMenu2_jbActionPerformed

    private void viewProcess_jbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewProcess_jbActionPerformed
        CardLayout card = (CardLayout) mainPanel.getLayout();
        card.show(mainPanel, "viewProcess");
        //Följande kod fyller upp tabellen som visas på sidan View my Processes
        List<ProcessModel> pLeadProcesses = new ArrayList<>();
        initDbManager();
        initProcessController();
        initTaskController();
        int pLeadId = dbm.getpLeadId();
        try {
            pLeadProcesses = pc.getProcesses(pLeadId);
        } catch (SQLException ex) {
            System.out.println("Fel vid hämtning av processledarens alla processer: " + ex.getMessage());
        }
        int row = 0;
        int rows = pLeadProcesses.size();
        Object[][] data = new Object[rows][4];
        for (ProcessModel pm : pLeadProcesses){
            data[row][0] = pm.getProcessId();
            data[row][1] = pm.getProjectedDuration();
            //Hämtar in elapsedtime från de tasks som tillhör processen: "SELECT SUM(duration) FROM Task WHERE processID = ?";
            try {    
                data[row][2] = tc.getElapsedTime(pm.getProcessId());
            } catch (SQLException ex) {
                System.out.println("Fel vid hämtning av elapsedTime: " + ex.getMessage());
            }
            data[row][3] = pm.getStatus();
            row++;    
        }
        //Tabellen skapas 
        String[] cols = {"Process number", "Budgeted time", "Elapsed time", "Status"};
        DefaultTableModel processes = new DefaultTableModel(data, cols);
        processes_table.setModel(processes);
        processes_table.setShowGrid(true);
    }//GEN-LAST:event_viewProcess_jbActionPerformed

    private void id_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_id_fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_id_fieldActionPerformed

    private void password_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_password_fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_password_fieldActionPerformed

    private void login_jbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_login_jbActionPerformed
        
        CardLayout card = (CardLayout) mainPanel.getLayout();
        card.show(mainPanel, "mainMenu");
      
        initDbManager();
        int pLeadId = dbm.tryParse(id_field.getText());
        dbm.setpLeadId(pLeadId);
    }//GEN-LAST:event_login_jbActionPerformed

    private void preprintID_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_preprintID_fieldActionPerformed
        
    }//GEN-LAST:event_preprintID_fieldActionPerformed
    
    private void addProcess_jbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addProcess_jbActionPerformed
        initDbManager();
        initProcessController();
        initTaskController();
        //hämta in data om processen från sidan och kalla på addProcess() i ProcessController       
        String processCategory = category_field.getText();
        int projectedDuration = 0;
        int budgetedTime = 0;
        int competenceID = 0;
        for (int x = 0; x < specTasks_table.getRowCount(); x++){
            if (specTasks_table.getModel().getValueAt(x, 1) != null){
        budgetedTime = dbm.tryParse(specTasks_table.getModel().getValueAt(x, 1).toString());
        projectedDuration = projectedDuration + budgetedTime;
            }
        }
        String comments = comments_pane.getText();          
        try {
            pc.addProcess(processCategory, projectedDuration, comments);
        } catch (SQLException ex) {
            System.out.println("Fel i databashanteringen vid addProcess(): " + ex.getMessage());
        }      
        //hämta in data från tabellen och kalla på addTask() i TaskController
        String taskName;
        for (int x = 0; x < specTasks_table.getRowCount(); x++){
            if (specTasks_table.getModel().getValueAt(x, 0) != null){
                taskName = specTasks_table.getModel().getValueAt(x, 0).toString();
                budgetedTime = dbm.tryParse(specTasks_table.getModel().getValueAt(x, 1).toString());
                competenceID = dbm.tryParse(specTasks_table.getModel().getValueAt(x, 2).toString());
                try {
                    tc.addTask(taskName, budgetedTime, competenceID);
                } catch (SQLException ex) {
                    System.out.println("Fel i databashanteringen vid addTask(): " + ex.getMessage());
                }
            }
        }
    }//GEN-LAST:event_addProcess_jbActionPerformed

    private void selectProcess_jbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectProcess_jbActionPerformed
        //Metoden fyller upp tabellen "corresponding tasks"
        initTaskController();
        List<TaskModel> tasksInProcess  = new ArrayList<>();
        //Hämtar in de tasks som tillhör en process
        int row = processes_table.getSelectedRow();
        int processID = parseInt(processes_table.getModel().getValueAt(row, 0).toString());
        try {
            tasksInProcess = tc.getTasks(processID);
        } catch (SQLException ex) {
            System.out.println("Fel vid inhämtning av de tasks som tillhör en process: " + ex.getMessage());
        }
        //Fyller upp Object-arrayen med viktiga värden från arbetsuppgifterna
        row = 0;
        int rows = tasksInProcess.size();
        Object[][] data = new Object[rows][6];
        for (TaskModel tm : tasksInProcess){
            data[row][0] = tm.getTaskID();
            data[row][1] = tm.getTaskName();
            data[row][2] = tm.getSuppID();
            data[row][3] = tm.getCostPerHour();
            data[row][4] = tm.getDuration();
            data[row][5] = tm.getStatus();
            row++;
        }
        //Tabellen skapas
        String[] cols = {"TaskID", "Name", "Responsibility", "Cost/h", "Elapsed time", "Status"};
        DefaultTableModel tasks = new DefaultTableModel(data, cols);
        tasks_table.setModel(tasks);
        tasks_table.setShowGrid(true);
    }//GEN-LAST:event_selectProcess_jbActionPerformed

    private void uppdateProcess_jbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uppdateProcess_jbActionPerformed
        //Gör så att uppdateProcess visas när knappen trycks
        CardLayout card = (CardLayout) mainPanel.getLayout();
        card.show(mainPanel, "uppdateProcess");
        
        initProcessController();
        int row = processes_table.getSelectedRow();
        int processID = parseInt(processes_table.getModel().getValueAt(row, 0).toString());
        processNum_field.setText(Integer.toString(processID));
        //Fyller upp alla fält på nästkommande sida
        try {
            ProcessModel pm = pc.getProcess(processID);
            up_pLeadID_field.setText(Integer.toString(pm.getpLeadId()));
            up_startDate_field.setText(pm.getStartDate());
            up_processCategory_field.setText(pm.getProcessCategory());
            up_projectedDuration_field.setText(Integer.toString(pm.getProjectedDuration()));
            up_comments_pane.setText(pm.getComments());
            up_status_field.setText(pm.getStatus());
        } catch (SQLException ex) {
            System.out.println("Fel vid hämtning av processID: " + ex.getMessage());
        }
    }//GEN-LAST:event_uppdateProcess_jbActionPerformed

    private void uppdateTask_jbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uppdateTask_jbActionPerformed
        //Gör så att uppdateTask visas när knappen trycks
        CardLayout card = (CardLayout) mainPanel.getLayout();
        card.show(mainPanel, "uppdateTask");
        
        initTaskController();
        int row = tasks_table.getSelectedRow();
        int taskID = parseInt(tasks_table.getModel().getValueAt(row, 0).toString());
        up_ta_taskID_field.setText(Integer.toString(taskID));
        
        try {
            TaskModel tm = tc.getTask(taskID);
            up_ta_processID_field.setText(Integer.toString(tm.getProcessID()));
            Integer suppID = tm.getSuppID();
            System.out.println(suppID);
            up_ta_suppID_field.setText(Integer.toString(suppID));
            up_ta_competenceID_field.setText(Integer.toString(tm.getCompetenceID()));
            up_ta_taskName_field.setText(tm.getTaskName());
            up_ta_startDate_field.setText(tm.getStartDate());
            up_ta_endDate_field.setText(tm.getStartDate());
            up_ta_budgetedTime_field.setText(Integer.toString(tm.getBudgetedTime()));
            up_ta_duration_field.setText(Integer.toString(tm.getDuration()));
            up_ta_costPerHour_field.setText(Integer.toString(tm.getCostPerHour()));
            up_ta_status_field.setText(tm.getStatus());
            jTextPane1.setText(tm.getComments());
        } catch (SQLException ex) {
            System.out.println("Fel i hanteringen av processID: " + ex.getMessage());
        }  
    }//GEN-LAST:event_uppdateTask_jbActionPerformed

    private void mainMenu3_jbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mainMenu3_jbActionPerformed
        CardLayout card = (CardLayout) mainPanel.getLayout();
        card.show(mainPanel, "viewProcess");
    }//GEN-LAST:event_mainMenu3_jbActionPerformed

    private void processNum_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_processNum_fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_processNum_fieldActionPerformed

    private void up_status_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_up_status_fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_up_status_fieldActionPerformed

    private void up_projectedDuration_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_up_projectedDuration_fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_up_projectedDuration_fieldActionPerformed

    private void up_processCategory_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_up_processCategory_fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_up_processCategory_fieldActionPerformed

    private void up_startDate_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_up_startDate_fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_up_startDate_fieldActionPerformed

    private void up_pLeadID_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_up_pLeadID_fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_up_pLeadID_fieldActionPerformed

    private void updatePr_jbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatePr_jbActionPerformed
        initProcessController();
        //Hämtar in data från fälten på sidan
        ProcessModel pm = new ProcessModel(parseInt(processNum_field.getText()), 
        parseInt(up_pLeadID_field.getText()), up_startDate_field.getText(),
        up_processCategory_field.getText(), parseInt(up_projectedDuration_field.getText()),
        up_comments_pane.getText(), up_status_field.getText());
        //Kallar på uppdateringsmetoden i ProcessController
        try {
            pc.updateProcess(pm);
        } catch (SQLException ex) {
            System.out.println("Fel i uppdateringen" + ex.getMessage());
        }
    }//GEN-LAST:event_updatePr_jbActionPerformed

    private void deleteProcess_jbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteProcess_jbActionPerformed
        initProcessController();
        //Hämtar in den markerade radens processID
        int row = processes_table.getSelectedRow();
        int processID = parseInt(processes_table.getModel().getValueAt(row, 0).toString());
        //Kallar på deleteProcess i ProcessController
        try {
            pc.deleteProcess(processID);
        } catch (SQLException ex) {
            System.out.println("Fel vid borttagning av process: " + ex.getMessage());
        }
    }//GEN-LAST:event_deleteProcess_jbActionPerformed

    private void deleteTask_jbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteTask_jbActionPerformed
        initTaskController();
        int row = tasks_table.getSelectedRow();
        int taskID = parseInt(tasks_table.getModel().getValueAt(row, 0).toString());
        
        try {
            tc.deleteTask(taskID);
        } catch (SQLException ex) {
            System.out.println("Fel vid borttagning av task: " + ex.getMessage());
        }
       
    }//GEN-LAST:event_deleteTask_jbActionPerformed

    private void signOut_jbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signOut_jbActionPerformed
        CardLayout card = (CardLayout) mainPanel.getLayout();
        card.show(mainPanel, "login");
    }//GEN-LAST:event_signOut_jbActionPerformed

    private void up_ta_competenceID_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_up_ta_competenceID_fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_up_ta_competenceID_fieldActionPerformed

    private void up_ta_status_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_up_ta_status_fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_up_ta_status_fieldActionPerformed

    private void up_ta_costPerHour_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_up_ta_costPerHour_fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_up_ta_costPerHour_fieldActionPerformed

    private void up_ta_duration_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_up_ta_duration_fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_up_ta_duration_fieldActionPerformed

    private void up_ta_endDate_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_up_ta_endDate_fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_up_ta_endDate_fieldActionPerformed

    private void up_ta_budgetedTime_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_up_ta_budgetedTime_fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_up_ta_budgetedTime_fieldActionPerformed

    private void up_ta_startDate_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_up_ta_startDate_fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_up_ta_startDate_fieldActionPerformed

    private void up_ta_taskName_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_up_ta_taskName_fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_up_ta_taskName_fieldActionPerformed

    private void up_ta_processID_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_up_ta_processID_fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_up_ta_processID_fieldActionPerformed

    private void up_ta_suppID_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_up_ta_suppID_fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_up_ta_suppID_fieldActionPerformed

    private void updateTa_jbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateTa_jbActionPerformed
        initTaskController();
        TaskModel tm = new TaskModel(parseInt(up_ta_taskID_field.getText()),
            parseInt(up_ta_processID_field.getText()), parseInt(up_ta_suppID_field.getText()),
            parseInt(up_ta_competenceID_field.getText()), up_ta_taskName_field.getText(), up_ta_startDate_field.getText(),
            up_ta_endDate_field.getText(), parseInt(up_ta_budgetedTime_field.getText()),
            parseInt(up_ta_duration_field.getText()), parseInt(up_ta_costPerHour_field.getText()),
            up_ta_status_field.getText(), jTextPane1.getText());

        try {
            tc.updateTask(tm);
        } catch (SQLException ex) {
            System.out.println("Fel i uppdateringen: " + ex.getMessage());
        }
    }//GEN-LAST:event_updateTa_jbActionPerformed

    private void up_ta_taskID_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_up_ta_taskID_fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_up_ta_taskID_fieldActionPerformed

    private void mainMenu4_jbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mainMenu4_jbActionPerformed
        CardLayout card = (CardLayout) mainPanel.getLayout();
        card.show(mainPanel, "viewProcess");
    }//GEN-LAST:event_mainMenu4_jbActionPerformed
    
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
            java.util.logging.Logger.getLogger(AdministratorView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdministratorView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdministratorView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdministratorView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdministratorView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addProcess_jb;
    private javax.swing.JFormattedTextField category_field;
    private javax.swing.JTextPane comments_pane;
    private javax.swing.JPanel createProcess;
    private javax.swing.JButton createProcess_jb;
    private javax.swing.JButton deleteProcess_jb;
    private javax.swing.JButton deleteTask_jb;
    private javax.swing.JFormattedTextField id_field;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
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
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JPanel login;
    private javax.swing.JButton login_jb;
    private javax.swing.JPanel mainMenu;
    private javax.swing.JButton mainMenu1_jb;
    private javax.swing.JButton mainMenu2_jb;
    private javax.swing.JButton mainMenu3_jb;
    private javax.swing.JButton mainMenu4_jb;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JPasswordField password_field;
    private javax.swing.JFormattedTextField preprintID_field;
    private javax.swing.JTextField processNum_field;
    private javax.swing.JTable processes_table;
    private javax.swing.JButton selectProcess_jb;
    private javax.swing.JButton signOut_jb;
    private javax.swing.JTable specTasks_table;
    private javax.swing.JTable tasks_table;
    private javax.swing.JTextPane up_comments_pane;
    private javax.swing.JTextField up_pLeadID_field;
    private javax.swing.JTextField up_processCategory_field;
    private javax.swing.JTextField up_projectedDuration_field;
    private javax.swing.JTextField up_startDate_field;
    private javax.swing.JTextField up_status_field;
    private javax.swing.JTextField up_ta_budgetedTime_field;
    private javax.swing.JTextField up_ta_competenceID_field;
    private javax.swing.JTextField up_ta_costPerHour_field;
    private javax.swing.JTextField up_ta_duration_field;
    private javax.swing.JTextField up_ta_endDate_field;
    private javax.swing.JTextField up_ta_processID_field;
    private javax.swing.JTextField up_ta_startDate_field;
    private javax.swing.JTextField up_ta_status_field;
    private javax.swing.JTextField up_ta_suppID_field;
    private javax.swing.JTextField up_ta_taskID_field;
    private javax.swing.JTextField up_ta_taskName_field;
    private javax.swing.JButton updatePr_jb;
    private javax.swing.JButton updateTa_jb;
    private javax.swing.JPanel uppdateProcess;
    private javax.swing.JButton uppdateProcess_jb;
    private javax.swing.JPanel uppdateTask;
    private javax.swing.JButton uppdateTask_jb;
    private javax.swing.JPanel viewProcess;
    private javax.swing.JButton viewProcess_jb;
    // End of variables declaration//GEN-END:variables
}
