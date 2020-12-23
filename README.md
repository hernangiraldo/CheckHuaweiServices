Cordova Check Huawei Services Availability
=======================================

Use this plugin to check if an android device has the `Huawei Services` available. It would be helpful if you want to check if the device is a Huawei without `Google Services`.


## Install

```
cordova plugin add https://github.com/hernangiraldo/CheckHuaweiServices.git
```

## Usage in Javascript

```
// available => iOS + Android

CheckHuaweiServices.checkHuaweiServicesAvailability(successCallback, failureCallback)
```

- `successCallback({ status: boolean})` status will be `true` if the device is a Huawei device without Google Services.
- `failureCallback(error:string)` is called if there was an error checking if the device has or not Google Services.

## Contributing

1. Fork it
2. Create your feature branch (`git checkout -b my-new-feature`)
3. Commit your changes (`git commit -am 'Add some feature'`)
4. Push to the branch (`git push origin my-new-feature`)
5. Create new Pull Request
