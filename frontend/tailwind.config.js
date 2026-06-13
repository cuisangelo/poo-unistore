/** @type {import('tailwindcss').Config} */
// Design system "Brasa" (see design.md). Warm editorial commerce:
// cream/greige canvas, enriched guinda brand, fresh teal accent.
module.exports = {
  content: ["./src/**/*.{html,ts}"],
  theme: {
    extend: {
      colors: {
        cream: "#faf7f3",
        sand: "#f4efe9",
        ink: { DEFAULT: "#211c1a", 2: "#6b615b", muted: "#9a8f87" },
        guinda: {
          DEFAULT: "#7a1f23",
          dark: "#651a1d",
          light: "#a83a3f",
          50: "#fbf1f1",
          100: "#f6dedf",
          200: "#ecbcbe",
          300: "#dd9094",
          400: "#c75f64",
          500: "#a83a3f",
          600: "#7a1f23",
          700: "#651a1d",
          800: "#511619",
          900: "#421316",
        },
        accent: {
          DEFAULT: "#2bb8c9",
          400: "#2bb8c9",
          500: "#1399a9",
          600: "#0f7d8a",
          dark: "#0f7d8a",
        },
      },
      fontFamily: {
        display: ['"Fraunces"', "Georgia", "serif"],
        sans: ['"Inter"', "system-ui", "sans-serif"],
      },
      borderRadius: { lg: "16px", xl: "20px" },
      boxShadow: {
        card: "0 1px 2px rgba(33,28,26,.05)",
        "card-hover": "0 12px 28px -8px rgba(33,28,26,.18)",
        drawer: "0 24px 60px -12px rgba(33,28,26,.30)",
      },
    },
  },
  plugins: [],
}
