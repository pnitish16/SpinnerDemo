# SpinnerDemo
Sample Spinner Demo.

adapter = new MySpinnerAdapter(MainActivity.this, al_data);
		spinner.setAdapter(adapter);
		
		keyhash generation
try {
        PackageInfo info = getPackageManager().getPackageInfo(
                "Your package name", 
                PackageManager.GET_SIGNATURES);
        for (Signature signature : info.signatures) {
            MessageDigest md = MessageDigest.getInstance("SHA");
            md.update(signature.toByteArray());
            Log.d("Your Tag", Base64.encodeToString(md.digest(), Base64.DEFAULT));
            }
    } catch (NameNotFoundException e) {

    } catch (NoSuchAlgorithmException e) {

    }
