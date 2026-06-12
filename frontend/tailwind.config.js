/** @type {import('tailwindcss').Config} */
module.exports = {
  content: ["./src/**/*.{html,ts}"],
  theme: {
    extend: {
      colors: {
        guinda: { DEFAULT: "#7a1f23", dark: "#5e171b", light: "#9b2c31" },
        accent: { DEFAULT: "#3babba", dark: "#2e96a4" },
      },
    },
  },
  plugins: [],
}
