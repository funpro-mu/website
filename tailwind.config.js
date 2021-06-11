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
      spacing: {
        '1-2': '50%',
        '1-3': '33.333333%',
        '2-3': '66.666667%',
        '1-4': '25%',
        '2-4': '50%',
        '3-4': '75%',
        '1-5': '20%',
        '2-5': '40%',
        '3-5': '60%',
        '4-5': '80%',
        '1-6': '16.666667%',
        '2-6': '33.333333%',
        '3-6': '50%',
        '4-6': '66.666667%',
        '5-6': '83.333333%',
        '1-12': '8.333333%',
        '2-12': '16.666667%',
        '3-12': '25%',
        '4-12': '33.333333%',
        '5-12': '41.666667%',
        '6-12': '50%',
        '7-12': '58.333333%',
        '8-12': '66.666667%',
        '9-12': '75%',
        '10-12': '83.333333%',
        '11-12': '91.666667%',
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
