class MineSweeper {
	
	private static int[][] field;

	public MineSweeper(int[][] field) {
		this.field = field;
	}

	// x = row, y = column
	public static String sweep(int x, int y) {
		if (field[x][y] == 1) {
			return "boom";
		}
		int minX = Math.max(x - 1, 0);
		int maxX = Math.min(x + 1, field.length - 1);
		int minY = Math.max(y - 1, 0);
		int maxY = Math.min(y + 1, field[x].length - 1);
		int bombs = 0;

		for (int i = minX; i <= maxX; i++) {
			for (int j = minY; j <= maxY; j++) {
				if (field[i][j] == 1) {
					bombs++;
				}
			}
		}
		return String.valueOf(bombs);
	}
}
