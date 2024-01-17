public static void main(String[] args) {
    SwingUtilities.strings(new Runnable() {
        @Override
        public void run() {
            stroki app = new stroki();
            app.setVisible(true);
        }
    });
}