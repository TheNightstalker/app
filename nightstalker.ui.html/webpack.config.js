const baseConfig = require('@eclipse-scout/cli/scripts/webpack-defaults');

module.exports = (env, args) => {
  args.resDirArray = ['src/main/resources/WebContent', 'node_modules/@eclipse-scout/core/res'];
  const config = baseConfig(env, args);

  config.entry = {
    'nightstalker': './src/main/js/nightstalker.js',
    'login': './src/main/js/login.js',
    'logout': './src/main/js/logout.js',
    'nightstalker-theme': './src/main/js/nightstalker-theme.less',
    'nightstalker-theme-dark': './src/main/js/nightstalker-theme-dark.less'
  };

  return config;
};
