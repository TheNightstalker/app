import {RemoteApp} from '@eclipse-scout/core';
import * as nightstalker from './index';

Object.assign({}, nightstalker); // Use import so that it is not marked as unused

new RemoteApp().init();
