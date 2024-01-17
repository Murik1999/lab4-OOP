public static void main(String[] args) {
    // Код, который будет выполнен при запуске программы
    SwingUtilities.invokeLater(new Runnable() {
        @Override
        public void run() {
            stroki app = new stroki();
            app.setVisible(true);
        }
    });
}