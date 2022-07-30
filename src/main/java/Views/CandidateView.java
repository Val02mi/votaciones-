package Views;

import Clases.ClsCandidate;
import Clases.ClsMessage;
import Controllers.CtlCandidate;
import java.util.LinkedList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author danie
 */
public class CandidateView extends javax.swing.JFrame {

    // Declarar variable / Crear un objeto
    JFrame ObjMainMenu;
    
    // Controlador
    CtlCandidate candidateControler;
    
    // Resultados
    LinkedList<ClsCandidate> candidateListObj = new LinkedList<>();
    
    // Manipular
    LinkedList<ClsCandidate> candidateGetList;

    /**
     * Creates new form CandidateView
     */
    public CandidateView(JFrame mainMenu) {
        initComponents();
        // Instanciar
        this.ObjMainMenu = mainMenu;
        this.candidateControler = new CtlCandidate();
        
        this.jButtonCandidateNew.setVisible(false);
        this.jButtonCandidateUpdate.setVisible(false);
        
        // Llamar método para obtención datos
        this.GetJTb_candidate();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        candidateForm = new javax.swing.JTabbedPane();
        jPanel5CandidatePaneList = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jScrollPane = new javax.swing.JScrollPane();
        candidateTable = new javax.swing.JTable();
        jButtonCandidateDelete = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        campoNombre = new javax.swing.JTextField();
        campoCedula = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        campoTelefono = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        campoCorreo = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        campoDescripcion = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        campoMensajeCampania = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        comboCiudadOrigen = new javax.swing.JComboBox<>();
        comboPartido = new javax.swing.JComboBox<>();
        campoPropuestas = new javax.swing.JTextField();
        jButtonBackMainView = new javax.swing.JButton();
        jButtonCandidateUpdate = new javax.swing.JButton();
        jButtonCandidateNew = new javax.swing.JButton();
        jButtonCandidateAdd = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(408, 308));

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 0, 0));
        jLabel1.setText("Gestor Candidato");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        candidateForm.setBackground(new java.awt.Color(255, 255, 255));
        candidateForm.setForeground(new java.awt.Color(153, 0, 0));
        candidateForm.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        candidateForm.setFocusTraversalPolicyProvider(true);

        jPanel5CandidatePaneList.setBackground(new java.awt.Color(255, 255, 255));

        jScrollPane2.setBackground(new java.awt.Color(204, 204, 204));

        candidateTable.setBackground(new java.awt.Color(204, 204, 204));
        candidateTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cédula", "Nombre", "Teléfono", "Correo", "Partido", "Ciudad", "Descripción", "Mensaje", "Propuestas"
            }
        ));
        candidateTable.setFocusable(false);
        candidateTable.setOpaque(false);
        candidateTable.setPreferredSize(new java.awt.Dimension(375, 300));
        candidateTable.setShowGrid(true);
        candidateTable.setShowHorizontalLines(false);
        candidateTable.setShowVerticalLines(false);
        jScrollPane.setViewportView(candidateTable);

        jScrollPane2.setViewportView(jScrollPane);

        jButtonCandidateDelete.setBackground(new java.awt.Color(249, 217, 223));
        jButtonCandidateDelete.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        jButtonCandidateDelete.setForeground(new java.awt.Color(102, 0, 0));
        jButtonCandidateDelete.setText("Eliminar");
        jButtonCandidateDelete.setBorderPainted(false);
        jButtonCandidateDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCandidateDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5CandidatePaneListLayout = new javax.swing.GroupLayout(jPanel5CandidatePaneList);
        jPanel5CandidatePaneList.setLayout(jPanel5CandidatePaneListLayout);
        jPanel5CandidatePaneListLayout.setHorizontalGroup(
            jPanel5CandidatePaneListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5CandidatePaneListLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel5CandidatePaneListLayout.createSequentialGroup()
                .addGap(237, 237, 237)
                .addComponent(jButtonCandidateDelete)
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel5CandidatePaneListLayout.setVerticalGroup(
            jPanel5CandidatePaneListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5CandidatePaneListLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 101, Short.MAX_VALUE)
                .addComponent(jButtonCandidateDelete)
                .addGap(32, 32, 32))
        );

        candidateForm.addTab("Lista", jPanel5CandidatePaneList);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setFocusable(false);

        jLabel4.setBackground(new java.awt.Color(0, 102, 255));
        jLabel4.setText("Nombre");

        jLabel5.setText("Cedula");

        campoNombre.setBackground(new java.awt.Color(204, 204, 204));
        campoNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoNombreActionPerformed(evt);
            }
        });

        campoCedula.setBackground(new java.awt.Color(204, 204, 204));
        campoCedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoCedulaActionPerformed(evt);
            }
        });

        jLabel6.setText("Teléfono");

        campoTelefono.setBackground(new java.awt.Color(204, 204, 204));
        campoTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoTelefonoActionPerformed(evt);
            }
        });

        jLabel7.setText("Correo");

        campoCorreo.setBackground(new java.awt.Color(204, 204, 204));
        campoCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoCorreoActionPerformed(evt);
            }
        });

        jLabel8.setText("Partido");

        jLabel9.setText("Ciudad");

        jLabel10.setText("Descripción");

        campoDescripcion.setBackground(new java.awt.Color(204, 204, 204));
        campoDescripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoDescripcionActionPerformed(evt);
            }
        });

        jLabel11.setText("Mensaje");

        campoMensajeCampania.setBackground(new java.awt.Color(204, 204, 204));
        campoMensajeCampania.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoMensajeCampaniaActionPerformed(evt);
            }
        });

        jLabel12.setText("Propuestas");

        comboCiudadOrigen.setBackground(new java.awt.Color(153, 153, 153));
        comboCiudadOrigen.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "--", "Armenia", "Bogotá", "Manizales", "Cali", "Medellín" }));
        comboCiudadOrigen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboCiudadOrigenActionPerformed(evt);
            }
        });

        comboPartido.setBackground(new java.awt.Color(153, 153, 153));
        comboPartido.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "--", "Demócrata", "De la U", "Liberal", "Pacto histórico" }));
        comboPartido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboPartidoActionPerformed(evt);
            }
        });

        campoPropuestas.setBackground(new java.awt.Color(204, 204, 204));
        campoPropuestas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoPropuestasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(119, 119, 119))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(campoMensajeCampania, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 337, Short.MAX_VALUE)
                        .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(campoDescripcion, javax.swing.GroupLayout.Alignment.LEADING))
                    .addComponent(jLabel10)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(campoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(campoCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(campoTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(campoCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel7)
                                .addGap(171, 171, 171)))))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comboCiudadOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comboPartido, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addComponent(campoPropuestas)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(comboCiudadOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboPartido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoMensajeCampania, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel12)
                .addGap(11, 11, 11)
                .addComponent(campoPropuestas, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE))
        );

        candidateForm.addTab("Formulario", jPanel3);

        jButtonBackMainView.setBackground(new java.awt.Color(249, 217, 217));
        jButtonBackMainView.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        jButtonBackMainView.setForeground(new java.awt.Color(102, 51, 0));
        jButtonBackMainView.setText("Regresar");
        jButtonBackMainView.setBorderPainted(false);
        jButtonBackMainView.setFocusPainted(false);
        jButtonBackMainView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBackMainViewActionPerformed(evt);
            }
        });

        jButtonCandidateUpdate.setBackground(new java.awt.Color(232, 219, 220));
        jButtonCandidateUpdate.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        jButtonCandidateUpdate.setForeground(new java.awt.Color(102, 0, 0));
        jButtonCandidateUpdate.setText("Actualizar");
        jButtonCandidateUpdate.setBorderPainted(false);
        jButtonCandidateUpdate.setFocusPainted(false);
        jButtonCandidateUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCandidateUpdateActionPerformed(evt);
            }
        });

        jButtonCandidateNew.setBackground(new java.awt.Color(225, 209, 209));
        jButtonCandidateNew.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        jButtonCandidateNew.setForeground(new java.awt.Color(102, 0, 0));
        jButtonCandidateNew.setText("Nuevo");
        jButtonCandidateNew.setBorderPainted(false);
        jButtonCandidateNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCandidateNewActionPerformed(evt);
            }
        });

        jButtonCandidateAdd.setBackground(new java.awt.Color(228, 215, 215));
        jButtonCandidateAdd.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        jButtonCandidateAdd.setForeground(new java.awt.Color(102, 0, 0));
        jButtonCandidateAdd.setText("Agregar");
        jButtonCandidateAdd.setBorderPainted(false);
        jButtonCandidateAdd.setFocusPainted(false);
        jButtonCandidateAdd.setFocusable(false);
        jButtonCandidateAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCandidateAddActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(candidateForm, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jButtonCandidateAdd)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonCandidateNew)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonCandidateUpdate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonBackMainView)
                        .addContainerGap())))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(candidateForm, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonBackMainView)
                    .addComponent(jButtonCandidateUpdate)
                    .addComponent(jButtonCandidateNew)
                    .addComponent(jButtonCandidateAdd))
                .addGap(29, 29, 29))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(24, 24, 24))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(122, 122, 122))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 409, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 534, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Obtener candidatos
    public void CandidatesGetting() {
        
        this.candidateListObj = this.candidateControler.GetJTb_candidate();
        this.UpdateJtb_candidate(candidateListObj);

    }
    
    // 1 M - Crear función que llama e indica al controlador que el modelo entregue datos y asigna a lista
    public void GetJTb_candidate(){
        
        //LinkedList<ClsCandidate> candidateGetList = this.candidateControler.GetJTb_candidate();
        this.candidateGetList = this.candidateControler.GetJTb_candidate();
        // Actualiza
        this.UpdateJtb_candidate(candidateGetList);
        
    }
    
    // Método / Función actualizar tabla
    public void UpdateJtb_candidate(LinkedList<ClsCandidate> updateCandidates){
        
        // Importamos para llenar tabla
        DefaultTableModel candidateModel = (DefaultTableModel) this.candidateTable.getModel();
        candidateModel.setRowCount(0);
        
        for (ClsCandidate updateCandidate : updateCandidates) {
            
            Object[] candidateRow = {updateCandidate.getDocumentNumber(), updateCandidate.getName(), updateCandidate.getPhone(), updateCandidate.getMail(), updateCandidate.getParty(), updateCandidate.getHometown(), updateCandidate.getDescription(), updateCandidate.getCampaign_message(), updateCandidate.getProposals()};
            
            candidateModel.addRow(candidateRow);
            
            
        }
         
    }
    
   


    private void jButtonCandidateUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCandidateUpdateActionPerformed
        // BUTTON: UPDATE
        
        String documentNumber = this.campoCedula.getText();
        String name = this.campoNombre.getText();
        long phone = Long.parseLong(this.campoTelefono.getText());
        String mail = this.campoCorreo.getText();
        String party = this.comboPartido.getSelectedItem().toString();
        String hometown = this.comboCiudadOrigen.getSelectedItem().toString();
        String description = this.campoDescripcion.getText();
        String campaign_message = this.campoMensajeCampania.getText();
        String proposals = this.campoPropuestas.getText();

        ClsCandidate candidateUpdate = new ClsCandidate(documentNumber, name, phone, mail, party, hometown, description, campaign_message, proposals);
        
        ClsMessage message = this.candidateControler.CandidateUpdate(candidateUpdate);

        if (message.getType().equals(ClsMessage.OK)) {
            GetJTb_candidate();
        }

        JOptionPane.showMessageDialog(rootPane, message.getText());
    }//GEN-LAST:event_jButtonCandidateUpdateActionPerformed

    private void jButtonBackMainViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBackMainViewActionPerformed
        // BUTTON: BACK
        this.setVisible(false);
        this.ObjMainMenu.setVisible(true);
    }//GEN-LAST:event_jButtonBackMainViewActionPerformed

    private void campoDescripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoDescripcionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoDescripcionActionPerformed

    private void campoCedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoCedulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoCedulaActionPerformed

    private void campoNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoNombreActionPerformed

    private void comboCiudadOrigenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboCiudadOrigenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboCiudadOrigenActionPerformed

    private void comboPartidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboPartidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboPartidoActionPerformed

    private void campoMensajeCampaniaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoMensajeCampaniaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoMensajeCampaniaActionPerformed

    private void campoTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoTelefonoActionPerformed

    private void campoCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoCorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoCorreoActionPerformed

    private void jButtonCandidateDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCandidateDeleteActionPerformed
        // BUTTON: DELETE
        int candidateColumn = 0;
        int candidateRow = this.candidateTable.getSelectedRow();
        String candidateId = this.candidateTable.getValueAt(candidateRow, candidateColumn).toString();
        
        ClsMessage message = this.candidateControler.candidateDelete(candidateId);
        
        if (message.getType().equals(ClsMessage.OK)){
            
            CandidatesGetting();
            
        }
        JOptionPane.showMessageDialog(rootPane, message.getText());
    }//GEN-LAST:event_jButtonCandidateDeleteActionPerformed

    private void jButtonCandidateNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCandidateNewActionPerformed
        // BUTTON: NEW
        this.jButtonCandidateAdd.setVisible(true);
        this.jButtonCandidateUpdate.setVisible(false);
        this.jButtonCandidateNew.setVisible(false);
        
        this.campoCedula.setEnabled(true);
        
        this.campoCedula.setText("");
        this.campoNombre.setText("");
        this.campoTelefono.setText("");
        this.campoCorreo.setText("");
        this.comboCiudadOrigen.setSelectedItem(null);
        this.comboPartido.setSelectedItem(null);
        this.campoDescripcion.setText("");
        this.campoMensajeCampania.setText("");
        this.campoPropuestas.setText("");
        
        
        
    }//GEN-LAST:event_jButtonCandidateNewActionPerformed

    private void jButtonCandidateAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCandidateAddActionPerformed
        // BUTTON: ADD

        // Exepciones
        /**try {*/

            // Declarar variable local - Referimos variable de la clase ClsCandidate
            String documentNumber = this.campoCedula.getText();
            String name = this.campoNombre.getText();
            long phone = Long.parseLong(this.campoTelefono.getText());
            String mail = this.campoCorreo.getText();
            String party = this.comboPartido.getSelectedItem().toString();
            String hometown = this.comboCiudadOrigen.getSelectedItem().toString();
            String description = this.campoDescripcion.getText();
            String campaign_message = this.campoMensajeCampania.getText();
            String proposals = this.campoPropuestas.getText();

            /**
            // Lógica / Condicionar
            if (documentNumber.equals("") || name.equals("") || description.equals("") || campaign_message.equals("")) {

                JOptionPane.showMessageDialog(this, "Complete el campo");

            } else {*/

                // Crear objeto de tipo ClsCandidate / Enviar parámetros

                ClsCandidate candidateObj = new ClsCandidate(documentNumber, name, phone, mail, party, hometown, description, campaign_message, proposals);

                // Llamar controlador / respuesta es para si se puede o no agregar
                //boolean respuesta = this.candidateControler.candidateAdd(candidate);
                //this.candidateControler.candidateAdd(candidate);
                // Almacenar en lista
                //candidateListObj.add(candidate);
                //this.FillJTable();

                // Agregamos
                ClsMessage message = this.candidateControler.candidateAdd(candidateObj);

                if (message.getType().equals(ClsMessage.OK)) {
                    CandidatesGetting();
                }

                JOptionPane.showMessageDialog(rootPane, message.getText());

                // Generar alerta
                /**JOptionPane.showMessageDialog(this, "El perfil del candidato: " + name + " " + "ha sido ingresado con éxito.");

            }

        } catch (Exception e) {

            // Generar alerta
            JOptionPane.showMessageDialog(this, "Por favor, inserte números.");
        }*/
    }//GEN-LAST:event_jButtonCandidateAddActionPerformed

    private void campoPropuestasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoPropuestasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoPropuestasActionPerformed

    public ClsCandidate CandidateSearch(String candidateId){
        
        for (ClsCandidate candidateSearch : this.candidateGetList) {
            
            if(candidateId.equals(candidateSearch.getDocumentNumber())){
                
                return candidateSearch;
                
            }
            
        }
        
        return null;
        
    }
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
            java.util.logging.Logger.getLogger(CandidateView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CandidateView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CandidateView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CandidateView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CandidateView(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField campoCedula;
    private javax.swing.JTextField campoCorreo;
    private javax.swing.JTextField campoDescripcion;
    private javax.swing.JTextField campoMensajeCampania;
    private javax.swing.JTextField campoNombre;
    private javax.swing.JTextField campoPropuestas;
    private javax.swing.JTextField campoTelefono;
    private javax.swing.JTabbedPane candidateForm;
    private javax.swing.JTable candidateTable;
    private javax.swing.JComboBox<String> comboCiudadOrigen;
    private javax.swing.JComboBox<String> comboPartido;
    private javax.swing.JButton jButtonBackMainView;
    private javax.swing.JButton jButtonCandidateAdd;
    private javax.swing.JButton jButtonCandidateDelete;
    private javax.swing.JButton jButtonCandidateNew;
    private javax.swing.JButton jButtonCandidateUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5CandidatePaneList;
    private javax.swing.JScrollPane jScrollPane;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
