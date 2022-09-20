package javasort;
import java.io.*;
import java.util.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FormSistema extends javax.swing.JFrame {
    ArrayList<Dados> lista = new ArrayList<>();
    
    Comparator<Dados> compareMetaScore = 
            (Dados a1, Dados a2) ->
                    (int) (a1.getMetascore()- a2.getMetascore());
    Comparator<Dados> compareRanking = 
            (Dados a1, Dados a2) ->
                    (int) (a1.getRanking()- a2.getRanking());
    Comparator<Dados> comparePlatform = 
            (Dados a1, Dados a2) ->
                    a1.getPlatform().compareTo(a2.getPlatform());
    
    Comparator<Dados> compareName = 
            (Dados a1, Dados a2) ->
                    a1.getName().compareTo(a2.getName());
    
    
    public FormSistema() {
        initComponents();
        carregaArquivo();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnOrdNome = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaDados = new javax.swing.JTable();
        cbOrdena = new javax.swing.JComboBox<>();
        txtBusca = new javax.swing.JTextField();
        btnBusca = new javax.swing.JButton();
        opBin = new javax.swing.JRadioButton();
        opSeq = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1704, 6, -1, 133));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javasort/70-707734_game-on-buying-selling-retro-video-games-png.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1540, -1));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dados", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Light", 0, 24))); // NOI18N
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnOrdNome.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        btnOrdNome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javasort/check-list.png"))); // NOI18N
        btnOrdNome.setText("Ordenar");
        btnOrdNome.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnOrdNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrdNomeActionPerformed(evt);
            }
        });
        jPanel3.add(btnOrdNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(1272, 134, 232, 70));

        tabelaDados.setAutoCreateRowSorter(true);
        tabelaDados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Ranking", "Nota Metacritic", "Plataforma", "Data Lançamento"
            }
        ));
        jScrollPane1.setViewportView(tabelaDados);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 1243, 410));

        cbOrdena.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nome", "Ranking", "Nota Metacritic", "Plataforma", "Data lançamento" }));
        cbOrdena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbOrdenaActionPerformed(evt);
            }
        });
        jPanel3.add(cbOrdena, new org.netbeans.lib.awtextra.AbsoluteConstraints(1272, 100, 232, -1));

        txtBusca.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dados para busca", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Light", 0, 14))); // NOI18N
        jPanel3.add(txtBusca, new org.netbeans.lib.awtextra.AbsoluteConstraints(1272, 222, 232, 55));

        btnBusca.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        btnBusca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javasort/task.png"))); // NOI18N
        btnBusca.setText("Buscar");
        btnBusca.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnBusca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscaActionPerformed(evt);
            }
        });
        jPanel3.add(btnBusca, new org.netbeans.lib.awtextra.AbsoluteConstraints(1272, 333, 232, 59));

        buttonGroup1.add(opBin);
        opBin.setText("Binária");
        jPanel3.add(opBin, new org.netbeans.lib.awtextra.AbsoluteConstraints(1396, 289, 108, -1));

        buttonGroup1.add(opSeq);
        opSeq.setText("Sequencial");
        opSeq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opSeqActionPerformed(evt);
            }
        });
        jPanel3.add(opSeq, new org.netbeans.lib.awtextra.AbsoluteConstraints(1276, 289, 108, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1539, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void carregaArquivo(){
     String csvFile = "games.csv";
        String line = "";
        String[] leitura = null;
        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            while ((line = br.readLine()) != null) {
                Dados game = new Dados();
                leitura = line.split(";");
                game.setName(leitura[0]);
                game.setRanking(Integer.parseInt(leitura[1]));
                game.setMetascore(Integer.parseInt(leitura[2]));
                game.setPlatform(leitura[3]);
                game.setReleaseDate(leitura[4]);
               
                
                /*System.out.println(leitura[0]+"\n");
                System.out.println(leitura[1]+"\n");
                System.out.println(leitura[2]+"\n");
                System.out.println(leitura[3]+"\n");
                System.out.println(leitura[4]+"\n");
                System.out.println(leitura[5]+"\n");
                System.out.println(leitura[6]+"\n");
                System.out.println(leitura[7]+"\n");
                
                System.out.println(leitura[8]+"\n");*/
                lista.add(game); 
            }// fim percurso no arquivo
            mostra();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    //https://1bestcsharp.blogspot.com/2016/03/java-populate-jtable-from-arraylist.html
    void mostra(){
        //limpando a tabela
        tabelaDados.setModel(new DefaultTableModel(null,new String[]{"Nome","Ranking","Nota Metacritic","Plataforma", "Data Lancamento"}));
       
        DefaultTableModel model = 
                (DefaultTableModel)tabelaDados.getModel();
        Object rowData[] = new Object[5];// qtd colunas
        for(Dados d: lista)
        {
            rowData[0] = d.getName();
            rowData[1] = d.getRanking();
            rowData[2] = d.getMetascore();
            rowData[3] = d.getPlatform();
            rowData[4] = d.getReleaseDate();
            //rowData[5] = d.getReleaseYear();
            
            
            
            
            model.addRow(rowData);
        }// fim preenche modelo
    }// fim mostra
   
    
   
    
    
    private void btnOrdNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrdNomeActionPerformed
    switch(cbOrdena.getSelectedIndex()){    
        case 0: Collections.sort(lista);
            break;
        case 1: lista.sort(compareRanking);
            break;
        case 2: lista.sort(compareMetaScore);
            break;
         case 3: lista.sort(comparePlatform);
            break; 
        default: JOptionPane.showMessageDialog(null,"Em construção!");    
        }    
        mostra();
    }//GEN-LAST:event_btnOrdNomeActionPerformed

    private void btnBuscaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscaActionPerformed
       int cont=0;
        switch(cbOrdena.getSelectedIndex()){    
        case 0: 
            if(opSeq.isSelected()){
                    for(Dados d: lista){
                        cont++;
                        if(d.getName().equalsIgnoreCase(txtBusca.getText())){
                          JOptionPane.showMessageDialog(null,"Titulo Game encontrado "+cont+" comparações");  
                            break;
                        }      
                    }
                }// fim if Sequencial;
            
             else{
                  Dados d = new Dados();
                  d.setName(txtBusca.getText()); // alterar atributo de acordo com a seleção
                  // definir o comparator caso não seja o padrão na chamado da busca binária
                  int pos = Collections.binarySearch(lista,d,compareName); // int pos = Collections.binarySearch(lista,d,compareTempMax);
                  JOptionPane.showMessageDialog(null,"Titulo Encontrado, posicao "+pos);  
                }// fim else binary 
            break;
        case 1:  if(opSeq.isSelected()){
                    for(Dados d: lista){
                        cont++;
                        if(d.getRanking() == Integer.parseInt(txtBusca.getText())){
                          JOptionPane.showMessageDialog(null,"Ranking game encontrado "+cont+" comparações");  
                            break;
                        }      
                    }
                }// fim if Sequencial;
                else{
                  Dados d = new Dados();
                  d.setRanking(Integer.parseInt(txtBusca.getText())); // alterar atributo de acordo com a seleção
                  // definir o comparator caso não seja o padrão na chamado da busca binária
                  int pos = Collections.binarySearch(lista,d,compareRanking); // int pos = Collections.binarySearch(lista,d,compareTempMax);
                  JOptionPane.showMessageDialog(null,"Ranking Game Encontrado, posicao "+pos);  
                }// fim else binary
            break;
        case 2:  if(opSeq.isSelected()){
                    for(Dados d: lista){
                        cont++;
                        if(d.getMetascore() == Integer.parseInt(txtBusca.getText())){
                          JOptionPane.showMessageDialog(null,"Metascore game encontrado "+cont+" comparações");  
                            break;
                        }      
                    }
                }// fim if Sequencial;
                else{
                  Dados d = new Dados();
                  d.setMetascore(Integer.parseInt(txtBusca.getText())); // alterar atributo de acordo com a seleção
                  // definir o comparator caso não seja o padrão na chamado da busca binária
                  int pos = Collections.binarySearch(lista,d,compareMetaScore); // int pos = Collections.binarySearch(lista,d,compareTempMax);
                  JOptionPane.showMessageDialog(null,"Metascore Game Encontrado, posicao "+pos);  
                }// fim else binary
            break;
            case 3:  if(opSeq.isSelected()){
                    for(Dados d: lista){
                        cont++;
                        if(d.getPlatform().equalsIgnoreCase(txtBusca.getText())){
                          JOptionPane.showMessageDialog(null,"Platforma encontrada "+cont+" comparações");  
                            break;
                        }      
                    }
                }// fim if Sequencial;
                else{
                  Dados d = new Dados();
                  d.setPlatform(txtBusca.getText()); // alterar atributo de acordo com a seleção
                  // definir o comparator caso não seja o padrão na chamado da busca binária
                  int pos = Collections.binarySearch(lista,d,comparePlatform); // int pos = Collections.binarySearch(lista,d,compareTempMax);
                  JOptionPane.showMessageDialog(null,"Plataforma Encontrada, posicao "+pos);  
                }// fim else binary
            break;
        default: JOptionPane.showMessageDialog(null,"Em construção");              
        }// switch
    }//GEN-LAST:event_btnBuscaActionPerformed

    private void cbOrdenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbOrdenaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbOrdenaActionPerformed

    private void opSeqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opSeqActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_opSeqActionPerformed
    
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
            java.util.logging.Logger.getLogger(FormSistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormSistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormSistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormSistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormSistema().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBusca;
    private javax.swing.JButton btnOrdNome;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbOrdena;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton opBin;
    private javax.swing.JRadioButton opSeq;
    private javax.swing.JTable tabelaDados;
    private javax.swing.JTextField txtBusca;
    // End of variables declaration//GEN-END:variables
}
