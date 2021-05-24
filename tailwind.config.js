const defaultTheme = require('tailwindcss/defaultTheme')

module.exports = {
  purge: {
    // in prod look at shadow-cljs output file in dev look at runtime, which will change files that are actually compiled; postcss watch should be a whole lot faster
    content: process.env.NODE_ENV == 'production' ? ["./public/js/main.js"] : ["./public/js/cljs-runtime/*.js"]
  },
  darkMode: false, // or 'media' or 'class'
  theme: {
    extend: {
      fontFamily: {
        sans: ["Raleway", ...defaultTheme.fontFamily.sans],
        serif: ["Arvo", ...defaultTheme.fontFamily.serif],
      },
    },
    backgroundColor: theme => ({
      ...theme('colors'),
      'primary': '#030c1b',
      'secondary': '#f3fcff',
    }),
  },
  variants: {},
  plugins: [
    require('@tailwindcss/forms'),
  ],
}
