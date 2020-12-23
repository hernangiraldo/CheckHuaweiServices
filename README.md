Cordova Check Huawei Services Availability
=======================================

Use this plugin to check if an android device has the `Huawei Services` available. It would be helpful if you want to check if the device is a Huawei without `Google Services`.


## Install

```
cordova plugin add https://github.com/hernangiraldo/CheckHuaweiServices.git
```
or
```
cordova plugin add cordova-plugin-check-huawei-services
```

## Usage in Javascript

```
// available => iOS + Android

CheckHuaweiServices.checkHuaweiServicesAvailability(successCallback, failureCallback)
```

- `successCallback({ status: boolean})` status will be `true` if the device is a Huawei device without Google Services.
- `failureCallback(error:string)` is called if there was an error checking if the device has or not Google Services.

## Usage in Ionic

On service or component when you are going to use the plugin:

```
 declare const CheckHuaweiServices;

 @Component({...}) //It could be a @Injectable()
 export class Component {

    validateHuaweiServices() {
      return new Promise((res, rej) => {
        CheckHuaweiServices.checkHuaweiServicesAvailability(
          ({ status }) => res(status),
          (err) => rej(err)
        )
      })
    }

    yourFunc() {
      this.validateHuaweiServices()
        .then(...)
        .catch(...)
    }
 }
```

## Contributing

1. Fork it
2. Create your feature branch (`git checkout -b feature/my-feature`)
3. Commit your changes (`git commit -am 'Changes description'`)
4. Push to the branch (`git push origin feature/my-feature`)
5. Create new Pull Request
